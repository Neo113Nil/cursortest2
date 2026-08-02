package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.lib.interfaces.ConversationRatingBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.lib.models.ConversationRating;
import io.intercom.android.sdk.blocks.lib.models.ConversationRatingOption;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButton;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public class ConversationRatingCard implements ConversationRatingBlock {
    private static final long ANIMATION_DURATION_MS = 200;
    private static final float DESELECTED_RATING_SCALE = 1.0f;
    private static final float DIALOG_HORIZONTAL_MARGIN = 16.0f;
    private static final float RATING_HORIZONTAL_PADDING = 17.0f;
    private static final float RATING_VERTICAL_PADDING = 14.0f;
    private static final float SELECTED_RATING_SCALE = 1.2f;
    private final Api api;
    private final Provider<AppConfig> appConfigProvider;
    private final String conversationId;
    private ConversationRating conversationRating;
    private LinearLayout rootLayout;
    private final View.OnClickListener ratingClickListener = new View.OnClickListener() { // from class: io.intercom.android.sdk.blocks.ConversationRatingCard.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int indexOf = ConversationRatingCard.this.ratingViews.indexOf(view);
            if (indexOf == -1 || ConversationRatingCard.this.ratingViews.size() != ConversationRatingCard.this.conversationRating.getOptions().size()) {
                return;
            }
            ConversationRatingCard conversationRatingCard = ConversationRatingCard.this;
            conversationRatingCard.rateConversation(conversationRatingCard.conversationRating, ConversationRatingCard.this.conversationRating.getOptions().get(indexOf));
            ConversationRatingCard.this.updateSelectedRating();
        }
    };
    private final List<ImageView> ratingViews = new ArrayList();
    private final ColorFilter deselectedFilter = ColorUtils.newGreyscaleFilter();

    ConversationRatingCard(Api api, String str, Provider<AppConfig> provider) {
        this.api = api;
        this.conversationId = str;
        this.appConfigProvider = provider;
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.ConversationRatingBlock
    public View addConversationRatingBlock(ConversationRating conversationRating, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        return createConversationRatingBlock(conversationRating, viewGroup);
    }

    private View createConversationRatingBlock(ConversationRating conversationRating, ViewGroup viewGroup) {
        final Context context = viewGroup.getContext();
        this.ratingViews.clear();
        this.conversationRating = conversationRating;
        this.rootLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.intercom_conversation_rating_block, viewGroup, false);
        updateViewVisibility();
        IntercomPrimaryButton intercomPrimaryButton = (IntercomPrimaryButton) this.rootLayout.findViewById(R.id.intercom_rating_tell_us_more_button);
        intercomPrimaryButton.setText(context.getString(R.string.intercom_tell_us_more));
        intercomPrimaryButton.setOnClick(new Function0() { // from class: io.intercom.android.sdk.blocks.ConversationRatingCard$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConversationRatingCard.this.m11996x4ef28641(context);
            }
        });
        setupRatingsLayout();
        updateSelectedRating();
        return this.rootLayout;
    }

    /* renamed from: lambda$createConversationRatingBlock$0$io-intercom-android-sdk-blocks-ConversationRatingCard, reason: not valid java name */
    /* synthetic */ Unit m11996x4ef28641(Context context) {
        showRemarkDialog(context);
        return null;
    }

    private void setupRatingsLayout() {
        LinearLayout linearLayout = (LinearLayout) this.rootLayout.findViewById(R.id.intercom_rating_options_layout);
        Context context = this.rootLayout.getContext();
        int dpToPx = ScreenUtils.dpToPx(14.0f, context);
        int dpToPx2 = ScreenUtils.dpToPx(RATING_HORIZONTAL_PADDING, context);
        for (int i = 0; i < this.conversationRating.getOptions().size(); i++) {
            ConversationRatingOption conversationRatingOption = this.conversationRating.getOptions().get(i);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
            ImageView imageView = new ImageView(context);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.intercom_conversation_rating_size);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17);
            layoutParams.setMargins(dpToPx2, dpToPx, dpToPx2, dpToPx);
            imageView.setLayoutParams(layoutParams);
            imageView.setLongClickable(false);
            loadEmojiWithFallback(context, conversationRatingOption.getUnicode(), imageView);
            imageView.setOnClickListener(this.ratingClickListener);
            frameLayout.addView(imageView);
            linearLayout.addView(frameLayout);
            this.ratingViews.add(imageView);
        }
    }

    private void updateViewVisibility() {
        if (this.rootLayout == null) {
            return;
        }
        boolean z = this.conversationRating.getRatingIndex().intValue() != -1;
        boolean isEmpty = TextUtils.isEmpty(this.conversationRating.getRemark());
        ((TextView) this.rootLayout.findViewById(R.id.rate_your_conversation_text_view)).setVisibility(!isEmpty ? 8 : 0);
        ((LinearLayout) this.rootLayout.findViewById(R.id.intercom_rating_options_layout)).setVisibility(!isEmpty ? 8 : 0);
        ((IntercomPrimaryButton) this.rootLayout.findViewById(R.id.intercom_rating_tell_us_more_button)).setVisibility((z && isEmpty) ? 0 : 8);
        ((LinearLayout) this.rootLayout.findViewById(R.id.intercom_you_rated_layout)).setVisibility(isEmpty ? 8 : 0);
        ConversationRatingOption findSelectedOption = findSelectedOption();
        if (findSelectedOption != null) {
            ImageView imageView = (ImageView) this.rootLayout.findViewById(R.id.intercom_you_rated_image_view);
            loadEmojiWithFallback(imageView.getContext(), findSelectedOption.getUnicode(), imageView);
        }
    }

    private ConversationRatingOption findSelectedOption() {
        for (ConversationRatingOption conversationRatingOption : this.conversationRating.getOptions()) {
            if (conversationRatingOption.getIndex().equals(this.conversationRating.getRatingIndex())) {
                return conversationRatingOption;
            }
        }
        return null;
    }

    void rateConversation(ConversationRating conversationRating, ConversationRatingOption conversationRatingOption) {
        if (conversationRating.getRatingIndex().equals(conversationRatingOption.getIndex())) {
            return;
        }
        conversationRating.setRatingIndex(conversationRatingOption.getIndex().intValue());
        this.api.rateConversation(this.conversationId, conversationRatingOption.getIndex().intValue());
        updateViewVisibility();
    }

    void addRemarkToConversation(ConversationRating conversationRating, String str) {
        if (TextUtils.isEmpty(conversationRating.getRemark())) {
            conversationRating.setRemark(str);
            this.api.addConversationRatingRemark(this.conversationId, str);
            updateViewVisibility();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSelectedRating() {
        if (this.conversationRating.getOptions().size() != this.ratingViews.size()) {
            return;
        }
        for (int i = 0; i < this.conversationRating.getOptions().size(); i++) {
            ConversationRatingOption conversationRatingOption = this.conversationRating.getOptions().get(i);
            ImageView imageView = this.ratingViews.get(i);
            if (this.conversationRating.getRatingIndex().intValue() == -1) {
                selectView(1.0f, imageView);
            } else if (this.conversationRating.getRatingIndex().equals(conversationRatingOption.getIndex())) {
                selectView(SELECTED_RATING_SCALE, imageView);
            } else {
                deselectView(imageView);
            }
        }
    }

    private void showRemarkDialog(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(R.string.intercom_tell_us_more);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int dpToPx = ScreenUtils.dpToPx(16.0f, context);
        layoutParams.setMargins(dpToPx, 0, dpToPx, 0);
        final EditText editText = new EditText(context);
        editText.getBackground().mutate().setColorFilter(this.appConfigProvider.get().getPrimaryColor(), PorterDuff.Mode.SRC_ATOP);
        editText.setLayoutParams(layoutParams);
        linearLayout.addView(editText);
        builder.setView(linearLayout);
        builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.blocks.ConversationRatingCard.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                String obj = editText.getText().toString();
                ConversationRatingCard conversationRatingCard = ConversationRatingCard.this;
                conversationRatingCard.addRemarkToConversation(conversationRatingCard.conversationRating, obj);
            }
        });
        builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.blocks.ConversationRatingCard.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        final AlertDialog create = builder.create();
        create.show();
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.intercom.android.sdk.blocks.ConversationRatingCard.4
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                if (!z || create.getWindow() == null) {
                    return;
                }
                create.getWindow().setSoftInputMode(5);
            }
        });
        create.getButton(-1).setTextColor(this.appConfigProvider.get().getPrimaryColor());
        create.getButton(-2).setTextColor(this.appConfigProvider.get().getPrimaryColor());
    }

    private void selectView(float f, ImageView imageView) {
        imageView.animate().setInterpolator(new OvershootInterpolator(2.0f)).scaleX(f).scaleY(f).setDuration(ANIMATION_DURATION_MS).start();
        imageView.clearColorFilter();
    }

    private void deselectView(ImageView imageView) {
        imageView.animate().setInterpolator(new OvershootInterpolator(0.6f)).scaleX(1.0f).scaleY(1.0f).setDuration(ANIMATION_DURATION_MS).start();
        imageView.setColorFilter(this.deselectedFilter);
    }

    private static String imageUrlForUnicode(String str) {
        return "https://js.intercomcdn.com/images/stickers/" + str + ".png";
    }

    static int getEmojiDrawableForUnicode(String str) {
        if (str == null) {
            return 0;
        }
        str.hashCode();
        switch (str) {
        }
        return 0;
    }

    private void loadEmojiWithFallback(Context context, final String str, final ImageView imageView) {
        IntercomCoilKt.loadIntercomImage(context, new ImageRequest.Builder(context).data(imageUrlForUnicode(str)).target(imageView).listener(new ImageRequest.Listener() { // from class: io.intercom.android.sdk.blocks.ConversationRatingCard.5
            @Override // coil.request.ImageRequest.Listener
            public void onCancel(ImageRequest imageRequest) {
            }

            @Override // coil.request.ImageRequest.Listener
            public void onStart(ImageRequest imageRequest) {
            }

            @Override // coil.request.ImageRequest.Listener
            public void onSuccess(ImageRequest imageRequest, SuccessResult successResult) {
            }

            @Override // coil.request.ImageRequest.Listener
            public void onError(ImageRequest imageRequest, ErrorResult errorResult) {
                int emojiDrawableForUnicode = ConversationRatingCard.getEmojiDrawableForUnicode(str);
                if (emojiDrawableForUnicode != 0) {
                    imageView.setImageResource(emojiDrawableForUnicode);
                }
            }
        }).build());
    }
}
