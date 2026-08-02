package ru.ozon.app.android.fresh.chat.widgets.responseActions.presentation;

import Xc.a;
import Xc.b;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00112\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u000fH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/responseActions/presentation/ResponseActionsView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "likeButton", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "dislikeButton", "refreshButton", "currentState", "Lru/ozon/app/android/fresh/chat/widgets/responseActions/presentation/ResponseActionsView$State;", "currentItem", "Lru/ozon/app/android/fresh/chat/widgets/responseActions/presentation/ResponseActionsVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "bind", "item", "onAction", "applyState", "updateState", "state", "Companion", "State", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ResponseActionsView extends LinearLayout {
    private Function1<? super AtomAction, Unit> actionHandler;
    private ResponseActionsVO currentItem;

    @NotNull
    private State currentState;

    @NotNull
    private final IconButtonV3View dislikeButton;

    @NotNull
    private final IconButtonV3View likeButton;

    @NotNull
    private final IconButtonV3View refreshButton;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int itemSpacing = ResourceExtKt.toPx(4);
    private static final int topPadding = ResourceExtKt.toPx(8);
    private static final int bottomPadding = ResourceExtKt.toPx(12);
    private static final int horizontalPadding = ResourceExtKt.toPx(12);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/responseActions/presentation/ResponseActionsView$Companion;", "", "<init>", "()V", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/responseActions/presentation/ResponseActionsView$State;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "LIKE", "DISLIKE", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class State {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State NONE = new State("NONE", 0);
        public static final State LIKE = new State("LIKE", 1);
        public static final State DISLIKE = new State("DISLIKE", 2);

        private static final /* synthetic */ State[] $values() {
            return new State[]{NONE, LIKE, DISLIKE};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private State(String str, int i11) {
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ResponseActionsView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void applyState() {
        ResponseActionsVO responseActionsVO = this.currentItem;
        if (responseActionsVO == null) {
            return;
        }
        IconButtonV3DTO likeIconButtonTapped = this.currentState == State.LIKE ? responseActionsVO.getLikeIconButtonTapped() : responseActionsVO.getLikeIconButton();
        IconButtonV3DTO dislikeIconButtonTapped = this.currentState == State.DISLIKE ? responseActionsVO.getDislikeIconButtonTapped() : responseActionsVO.getDislikeIconButton();
        IconButtonV3HolderKt.bindOrGone(this.likeButton, likeIconButtonTapped, new ResponseActionsView$applyState$1(this));
        IconButtonV3HolderKt.bindOrGone(this.dislikeButton, dislikeIconButtonTapped, new ResponseActionsView$applyState$2(this));
        IconButtonV3HolderKt.bindOrGone(this.refreshButton, responseActionsVO.getRefreshIconButton(), new ResponseActionsView$applyState$3(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateState(State state) {
        if (this.currentState == state) {
            return;
        }
        this.currentState = state;
        applyState();
    }

    public final void bind(@NotNull ResponseActionsVO item, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.currentItem = item;
        this.actionHandler = onAction;
        applyState();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseActionsView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        iconButtonV3View.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(iconButtonV3View);
        this.likeButton = iconButtonV3View;
        IconButtonV3View iconButtonV3View2 = new IconButtonV3View(context, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i12 = itemSpacing;
        layoutParams.leftMargin = i12;
        iconButtonV3View2.setLayoutParams(layoutParams);
        addView(iconButtonV3View2);
        this.dislikeButton = iconButtonV3View2;
        IconButtonV3View iconButtonV3View3 = new IconButtonV3View(context, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = i12;
        iconButtonV3View3.setLayoutParams(layoutParams2);
        addView(iconButtonV3View3);
        this.refreshButton = iconButtonV3View3;
        this.currentState = State.NONE;
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        int i13 = horizontalPadding;
        setPadding(i13, topPadding, i13, bottomPadding);
    }
}
