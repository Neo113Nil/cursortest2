package ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.presentation;

import WZ.t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.G;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.flexbox.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.presentation.PromptSuggestionsVO;
import ru.ozon.app.android.fresh.common.widgets.GenericDiffUtil;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.tag.TagButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001#\b\u0001\u0018\u0000 )2\u00020\u0001:\u0003)*+B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JO\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062 \u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\u0004\u0012\u00020\f0\b2\u0016\u0010\u000f\u001a\u0012\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R2\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0015R(\u0010\u000f\u001a\u0014\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsVO;", "item", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "actionHandler", "Lkotlin/Function1;", "processViewEvents", "bind", "(Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsVO;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "", "widgetId", "J", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "", "isActionHandlingEnabled", "Z", "()Z", "setActionHandlingEnabled", "(Z)V", "Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsView$TagButtonAdapter;", "tagButtonAdapter", "Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsView$TagButtonAdapter;", "ru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsView$flexboxLayoutManager$1", "flexboxLayoutManager", "Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsView$flexboxLayoutManager$1;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Companion", "TagButtonAdapter", "TagButtonViewHolder", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PromptSuggestionsView extends LinearLayout {
    private Function2<? super AtomAction, ? super t, Unit> actionHandler;

    @NotNull
    private final PromptSuggestionsView$flexboxLayoutManager$1 flexboxLayoutManager;
    private boolean isActionHandlingEnabled;
    private Function1<? super t, Unit> processViewEvents;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final TagButtonAdapter tagButtonAdapter;

    @NotNull
    private final TextAtomV2View titleView;
    private long widgetId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int tagButtonsHorizontalPadding = ResourceExtKt.toPx(4);
    private static final int tagButtonsTopPadding = ResourceExtKt.toPx(8);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsView$Companion;", "", "<init>", "()V", "tagButtonsHorizontalPadding", "", "tagButtonsTopPadding", "MAX_LINES", "create", "Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsView;", "context", "Landroid/content/Context;", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PromptSuggestionsView create(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            PromptSuggestionsView promptSuggestionsView = new PromptSuggestionsView(context, null);
            promptSuggestionsView.setId(View.generateViewId());
            promptSuggestionsView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            promptSuggestionsView.setGravity(17);
            promptSuggestionsView.setOrientation(1);
            return promptSuggestionsView;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BA\u0012 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0004\u0012\u00020\b0\u0004\u0012\u0016\u0010\u000b\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R.\u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0004\u0012\u00020\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R$\u0010\u000b\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsView$TagButtonAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsVO$SuggestionButton;", "Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsView$TagButtonViewHolder;", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "actionHandler", "Lkotlin/Function1;", "processViewEvents", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsView$TagButtonViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsView$TagButtonViewHolder;I)V", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class TagButtonAdapter extends androidx.recyclerview.widget.t<PromptSuggestionsVO.SuggestionButton, TagButtonViewHolder> {

        @NotNull
        private final Function2<AtomAction, t, Unit> actionHandler;

        @NotNull
        private final Function1<t, Unit> processViewEvents;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public TagButtonAdapter(@NotNull Function2<? super AtomAction, ? super t, Unit> actionHandler, @NotNull Function1<? super t, Unit> processViewEvents) {
            super(new GenericDiffUtil());
            Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
            Intrinsics.checkNotNullParameter(processViewEvents, "processViewEvents");
            this.actionHandler = actionHandler;
            this.processViewEvents = processViewEvents;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void onBindViewHolder(@NotNull TagButtonViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            List<PromptSuggestionsVO.SuggestionButton> currentList = getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
            PromptSuggestionsVO.SuggestionButton suggestionButton = (PromptSuggestionsVO.SuggestionButton) C7714v.Q(position, currentList);
            if (suggestionButton == null) {
                return;
            }
            holder.bind(suggestionButton, this.processViewEvents);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        @NotNull
        public TagButtonViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TagButtonView tagButtonView = new TagButtonView(context, null, 0, 0, 14, null);
            FlexboxLayoutManager.b bVar = new FlexboxLayoutManager.b(-2, -2);
            bVar.setMargins(PromptSuggestionsView.tagButtonsHorizontalPadding, PromptSuggestionsView.tagButtonsTopPadding, PromptSuggestionsView.tagButtonsHorizontalPadding, 0);
            tagButtonView.setLayoutParams(bVar);
            return new TagButtonViewHolder(tagButtonView, this.actionHandler);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0016\u0010\u000f\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R.\u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0004\u0012\u00020\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsView$TagButtonViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "view", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "actionHandler", "<init>", "(Lru/ozon/uni/android/controls/tag/TagButtonView;Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsVO$SuggestionButton;", "item", "Lkotlin/Function1;", "processViewEvent", "bind", "(Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsVO$SuggestionButton;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "Lkotlin/jvm/functions/Function2;", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class TagButtonViewHolder extends RecyclerView.C {

        @NotNull
        private final Function2<AtomAction, t, Unit> actionHandler;

        @NotNull
        private final TagButtonView view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public TagButtonViewHolder(@NotNull TagButtonView view, @NotNull Function2<? super AtomAction, ? super t, Unit> actionHandler) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
            this.view = view;
            this.actionHandler = actionHandler;
        }

        public final void bind(@NotNull final PromptSuggestionsVO.SuggestionButton item, @NotNull final Function1<? super t, Unit> processViewEvent) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(processViewEvent, "processViewEvent");
            TagButtonHolderKt.bind(this.view, item.getButton(), new PromptSuggestionsView$TagButtonViewHolder$bind$1(item, this));
            final TagButtonView tagButtonView = this.view;
            G.a(tagButtonView, new Runnable() { // from class: ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.presentation.PromptSuggestionsView$TagButtonViewHolder$bind$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    t tokenizedEvent = item.getTokenizedEvent();
                    if (tokenizedEvent != null) {
                        processViewEvent.invoke(tokenizedEvent);
                    }
                }
            });
        }
    }

    public /* synthetic */ PromptSuggestionsView(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public final void bind(@NotNull PromptSuggestionsVO item, @NotNull Function2<? super AtomAction, ? super t, Unit> actionHandler, @NotNull Function1<? super t, Unit> processViewEvents) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(processViewEvents, "processViewEvents");
        this.widgetId = item.getId();
        this.actionHandler = actionHandler;
        this.processViewEvents = processViewEvents;
        TextHolderKt.bindOrGone$default(this.titleView, item.getTitle(), null, 2, null);
        this.tagButtonAdapter.submitList(item.getSuggestions());
    }

    /* renamed from: isActionHandlingEnabled, reason: from getter */
    public final boolean getIsActionHandlingEnabled() {
        return this.isActionHandlingEnabled;
    }

    public final void setActionHandlingEnabled(boolean z11) {
        this.isActionHandlingEnabled = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [androidx.recyclerview.widget.RecyclerView$o, com.google.android.flexbox.FlexboxLayoutManager, ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.presentation.PromptSuggestionsView$flexboxLayoutManager$1] */
    private PromptSuggestionsView(final Context context) {
        super(context, null, 0);
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(View.generateViewId());
        textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textAtomV2View.setGravity(17);
        textAtomV2View.setTextIsSelectable(false);
        this.titleView = textAtomV2View;
        this.isActionHandlingEnabled = true;
        TagButtonAdapter tagButtonAdapter = new TagButtonAdapter(new PromptSuggestionsView$tagButtonAdapter$1(this), new PromptSuggestionsView$tagButtonAdapter$2(this));
        this.tagButtonAdapter = tagButtonAdapter;
        ?? r62 = new FlexboxLayoutManager(context) { // from class: ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.presentation.PromptSuggestionsView$flexboxLayoutManager$1
            @Override // com.google.android.flexbox.FlexboxLayoutManager, com.google.android.flexbox.a
            public List<c> getFlexLinesInternal() {
                List<c> flexLinesInternal = super.getFlexLinesInternal();
                int size = flexLinesInternal.size();
                if (size > 4) {
                    flexLinesInternal.subList(4, size).clear();
                }
                return flexLinesInternal;
            }
        };
        r62.setFlexDirection(0);
        r62.setJustifyContent(2);
        r62.setFlexWrap(1);
        this.flexboxLayoutManager = r62;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(View.generateViewId());
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setNestedScrollingEnabled(false);
        int i11 = tagButtonsHorizontalPadding;
        recyclerView.setPadding(i11, tagButtonsTopPadding, i11, 0);
        recyclerView.setLayoutManager(r62);
        recyclerView.setAdapter(tagButtonAdapter);
        this.recyclerView = recyclerView;
        addView(textAtomV2View);
        addView(recyclerView);
    }
}
