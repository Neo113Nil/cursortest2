package ru.ozon.fintech.ui.screenstateV20;

import Fs.ViewOnClickListenerC3059a;
import M30.b;
import Sc.o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.fintech.ui.button.large.FinLargeButtonView;
import ru.ozon.fintech.ui.screenstateV20.ScreenStateV20;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0013R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010$¨\u0006%"}, d2 = {"Lru/ozon/fintech/ui/screenstateV20/ScreenStateViewV20;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "reset", "()V", "Lru/ozon/fintech/ui/screenstateV20/ScreenStateV20;", "state", "bindState", "(Lru/ozon/fintech/ui/screenstateV20/ScreenStateV20;)V", "Landroid/widget/ImageView;", "image", "Landroid/widget/ImageView;", "Landroid/widget/ProgressBar;", "progress", "Landroid/widget/ProgressBar;", "progressBtn", "Lru/ozon/fintech/ui/button/large/FinLargeButtonView;", "butt", "Lru/ozon/fintech/ui/button/large/FinLargeButtonView;", "Landroid/widget/TextView;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Landroid/widget/TextView;", "desc", "closeBtn", "LM30/b;", "progressDelayed", "LM30/b;", "progressDelayedBtn", "Lru/ozon/fintech/ui/screenstateV20/ScreenStateV20;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScreenStateViewV20 extends ConstraintLayout {

    @NotNull
    private final FinLargeButtonView butt;

    @NotNull
    private final ImageView closeBtn;

    @NotNull
    private final TextView desc;

    @NotNull
    private final ImageView image;

    @NotNull
    private final ProgressBar progress;

    @NotNull
    private final ProgressBar progressBtn;

    @NotNull
    private final b progressDelayed;

    @NotNull
    private final b progressDelayedBtn;
    private ScreenStateV20 state;

    @NotNull
    private final TextView title;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScreenStateViewV20(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindState$lambda$2(ScreenStateViewV20 screenStateViewV20, ScreenStateV20 screenStateV20, View view) {
        screenStateViewV20.setVisibility(8);
        Function0<Unit> closeButtAction = ((ScreenStateV20.Error) screenStateV20).getCloseButtAction();
        if (closeButtAction != null) {
            closeButtAction.invoke();
        }
    }

    public final void bindState(@NotNull ScreenStateV20 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        if (state instanceof ScreenStateV20.Progress) {
            ScreenStateV20.Progress progress = (ScreenStateV20.Progress) state;
            if (progress.isAfterError()) {
                this.progressDelayed.c();
                this.progressDelayed.d();
                this.progressDelayedBtn.c();
                this.progressDelayedBtn.e(progress.getDelayedProgress());
                this.progressDelayedBtn.f();
                this.butt.setVisibility(0);
                this.title.setVisibility(0);
                this.desc.setVisibility(0);
                this.image.setVisibility(0);
                this.butt.bindState(progress.getButt());
            } else {
                this.progressDelayedBtn.c();
                this.progressDelayedBtn.d();
                this.progressDelayed.c();
                this.progressDelayed.e(progress.getDelayedProgress());
                this.progressDelayed.f();
                this.butt.setVisibility(8);
                this.title.setVisibility(8);
                this.desc.setVisibility(8);
                this.image.setVisibility(8);
            }
            if (progress.getColor() != null) {
                this.progressBtn.setIndeterminateTintList(ColorStateList.valueOf(a.getColor(getContext(), progress.getColor().intValue())));
                return;
            }
            return;
        }
        if (state instanceof ScreenStateV20.Error) {
            this.progressDelayed.c();
            this.progressDelayed.d();
            this.progressDelayedBtn.c();
            this.progressDelayedBtn.d();
            ScreenStateV20.Error error = (ScreenStateV20.Error) state;
            if (error.getButt() != null) {
                this.butt.setVisibility(0);
                this.butt.bindState(error.getButt());
            } else {
                this.butt.setVisibility(8);
            }
            this.title.setVisibility(error.getTitle() != null ? 0 : 8);
            this.title.setText(error.getTitle());
            this.desc.setVisibility(error.getDescription() != null ? 0 : 8);
            this.desc.setText(error.getDescription());
            this.image.setVisibility(error.getIcon() != null ? 0 : 8);
            Integer icon = error.getIcon();
            if (icon != null) {
                this.image.setImageDrawable(a.getDrawable(getContext(), icon.intValue()));
            }
            this.closeBtn.setVisibility(error.isClosable() ? 0 : 8);
            this.closeBtn.setOnClickListener(new ViewOnClickListenerC3059a(3, this, (ScreenStateV20.Error) state));
            return;
        }
        if (!(state instanceof ScreenStateV20.Empty)) {
            throw new o();
        }
        this.progressDelayed.c();
        this.progressDelayed.d();
        this.progressDelayedBtn.c();
        this.progressDelayedBtn.d();
        ScreenStateV20.Empty empty = (ScreenStateV20.Empty) state;
        if (empty.getButt() != null) {
            this.butt.setVisibility(0);
            this.butt.bindState(empty.getButt());
        } else {
            this.butt.setVisibility(8);
        }
        this.title.setVisibility(empty.getTitle() != null ? 0 : 8);
        this.title.setText(empty.getTitle());
        this.desc.setVisibility(empty.getDescription() != null ? 0 : 8);
        this.desc.setText(empty.getDescription());
        this.image.setVisibility(empty.getIcon() != null ? 0 : 8);
        Integer icon2 = empty.getIcon();
        if (icon2 != null) {
            this.image.setImageDrawable(a.getDrawable(getContext(), icon2.intValue()));
        }
    }

    public final void reset() {
        this.progressDelayed.c();
        this.progressDelayedBtn.c();
        this.progress.setVisibility(8);
        this.progressBtn.setVisibility(8);
        this.butt.setVisibility(8);
        this.title.setVisibility(8);
        this.desc.setVisibility(8);
        this.image.setVisibility(8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScreenStateViewV20(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ScreenStateViewV20(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenStateViewV20(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R.layout.screen_state_v2_view, this);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.screen_state_progress);
        this.progress = progressBar;
        this.progressBtn = (ProgressBar) findViewById(R.id.screen_state_progress_button);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, G80.a.f9766d, i11, i11);
        try {
            try {
                progressBar.setIndeterminateTintList(ColorStateList.valueOf(obtainStyledAttributes.getColor(1, a.getColor(context, R.color.oz_semantic_accent_primary))));
            } catch (Exception e11) {
                L80.a.c("ScreenStateView", null, e11);
            }
            this.butt = (FinLargeButtonView) findViewById(R.id.screen_state_butt);
            this.title = (TextView) findViewById(R.id.screen_state_title);
            this.desc = (TextView) findViewById(R.id.screen_state_description);
            this.image = (ImageView) findViewById(R.id.screen_state_image);
            this.closeBtn = (ImageView) findViewById(R.id.close_screen_btn);
            setClickable(true);
            setFocusable(true);
            this.progressDelayed = new b(this.progress);
            this.progressDelayedBtn = new b(this.progressBtn);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
