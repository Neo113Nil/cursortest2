package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.MediaPickerButtonVisibilityStateKey;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.ReviewFormModalStateKey;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001:\u000212B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001bj\b\u0012\u0004\u0012\u00020\u0002`\u001c2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR,\u0010#\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R(\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060(0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/di/ReviewFormComponent;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO;", "newItem", "", "getPayload", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO;)Ljava/lang/Object;", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentView;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVH;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentMapper;", "getMapper", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentMapper;", "mapper", "ExpandUpdatedPayload", "PickerButtonVisibilityPayload", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReviewFormCommentViewMapper extends WidgetViewMapper2<ReviewFormComponent, ReviewFormCommentVO, ReviewFormCommentVO> {

    @NotNull
    private final Function2<View, ComposerReferences, ReviewFormCommentVH> holderProducer = new ReviewFormCommentViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(ReviewFormModalStateKey.class, MediaPickerButtonVisibilityStateKey.class, CommentUpdateKey.class);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentViewMapper$ExpandUpdatedPayload;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class ExpandUpdatedPayload {

        @NotNull
        public static final ExpandUpdatedPayload INSTANCE = new ExpandUpdatedPayload();

        private ExpandUpdatedPayload() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ExpandUpdatedPayload);
        }

        public int hashCode() {
            return -525627540;
        }

        @NotNull
        public String toString() {
            return "ExpandUpdatedPayload";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentViewMapper$PickerButtonVisibilityPayload;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class PickerButtonVisibilityPayload {

        @NotNull
        public static final PickerButtonVisibilityPayload INSTANCE = new PickerButtonVisibilityPayload();

        private PickerButtonVisibilityPayload() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof PickerButtonVisibilityPayload);
        }

        public int hashCode() {
            return -1285185123;
        }

        @NotNull
        public String toString() {
            return "PickerButtonVisibilityPayload";
        }
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof ReviewFormCommentVO;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, ReviewFormCommentVH> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ReviewFormComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ReviewFormComponent.INSTANCE.getInstance(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public ReviewFormCommentView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ReviewFormCommentView(context);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public ReviewFormCommentMapper getMapper() {
        return component().getCommentMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Object getPayload(@NotNull ReviewFormCommentVO oldItem, @NotNull ReviewFormCommentVO newItem) {
        ReviewFormCommentVO copy;
        ReviewFormCommentVO copy2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (oldItem.getIsExpanded() != newItem.getIsExpanded()) {
            copy2 = oldItem.copy((r35 & 1) != 0 ? oldItem.id : 0L, (r35 & 2) != 0 ? oldItem.uploadKey : null, (r35 & 4) != 0 ? oldItem.placeholder : null, (r35 & 8) != 0 ? oldItem.value : null, (r35 & 16) != 0 ? oldItem.hints : null, (r35 & 32) != 0 ? oldItem.suggests : null, (r35 & 64) != 0 ? oldItem.maxLines : 0, (r35 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldItem.minLines : 0, (r35 & 256) != 0 ? oldItem.maxInputLength : 0, (r35 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldItem.clickTokenizedEvent : null, (r35 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldItem.mediaPickerButton : null, (r35 & 2048) != 0 ? oldItem.isFooterSticky : false, (r35 & 4096) != 0 ? oldItem.isExpanded : newItem.getIsExpanded(), (r35 & 8192) != 0 ? oldItem.isModal : false, (r35 & 16384) != 0 ? oldItem.isPickerButtonVisible : false);
            if (Intrinsics.d(copy2, newItem)) {
                return ExpandUpdatedPayload.INSTANCE;
            }
        }
        if (oldItem.getIsPickerButtonVisible() == newItem.getIsPickerButtonVisible()) {
            return null;
        }
        copy = oldItem.copy((r35 & 1) != 0 ? oldItem.id : 0L, (r35 & 2) != 0 ? oldItem.uploadKey : null, (r35 & 4) != 0 ? oldItem.placeholder : null, (r35 & 8) != 0 ? oldItem.value : null, (r35 & 16) != 0 ? oldItem.hints : null, (r35 & 32) != 0 ? oldItem.suggests : null, (r35 & 64) != 0 ? oldItem.maxLines : 0, (r35 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldItem.minLines : 0, (r35 & 256) != 0 ? oldItem.maxInputLength : 0, (r35 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldItem.clickTokenizedEvent : null, (r35 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldItem.mediaPickerButton : null, (r35 & 2048) != 0 ? oldItem.isFooterSticky : false, (r35 & 4096) != 0 ? oldItem.isExpanded : false, (r35 & 8192) != 0 ? oldItem.isModal : false, (r35 & 16384) != 0 ? oldItem.isPickerButtonVisible : newItem.getIsPickerButtonVisible());
        if (Intrinsics.d(copy, newItem)) {
            return PickerButtonVisibilityPayload.INSTANCE;
        }
        return null;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public ReviewFormCommentVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull ReviewFormCommentVO oldItem) {
        ReviewFormCommentVO copy;
        ReviewFormCommentVO copy2;
        ReviewFormCommentVO copy3;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof ReviewFormModalStateKey) {
            copy3 = oldItem.copy((r35 & 1) != 0 ? oldItem.id : 0L, (r35 & 2) != 0 ? oldItem.uploadKey : null, (r35 & 4) != 0 ? oldItem.placeholder : null, (r35 & 8) != 0 ? oldItem.value : null, (r35 & 16) != 0 ? oldItem.hints : null, (r35 & 32) != 0 ? oldItem.suggests : null, (r35 & 64) != 0 ? oldItem.maxLines : 0, (r35 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldItem.minLines : 0, (r35 & 256) != 0 ? oldItem.maxInputLength : 0, (r35 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldItem.clickTokenizedEvent : null, (r35 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldItem.mediaPickerButton : null, (r35 & 2048) != 0 ? oldItem.isFooterSticky : false, (r35 & 4096) != 0 ? oldItem.isExpanded : ((ReviewFormModalStateKey) update).getIsExpanded(), (r35 & 8192) != 0 ? oldItem.isModal : false, (r35 & 16384) != 0 ? oldItem.isPickerButtonVisible : false);
            return copy3;
        }
        if (update instanceof MediaPickerButtonVisibilityStateKey) {
            copy2 = oldItem.copy((r35 & 1) != 0 ? oldItem.id : 0L, (r35 & 2) != 0 ? oldItem.uploadKey : null, (r35 & 4) != 0 ? oldItem.placeholder : null, (r35 & 8) != 0 ? oldItem.value : null, (r35 & 16) != 0 ? oldItem.hints : null, (r35 & 32) != 0 ? oldItem.suggests : null, (r35 & 64) != 0 ? oldItem.maxLines : 0, (r35 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldItem.minLines : 0, (r35 & 256) != 0 ? oldItem.maxInputLength : 0, (r35 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldItem.clickTokenizedEvent : null, (r35 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldItem.mediaPickerButton : null, (r35 & 2048) != 0 ? oldItem.isFooterSticky : false, (r35 & 4096) != 0 ? oldItem.isExpanded : false, (r35 & 8192) != 0 ? oldItem.isModal : false, (r35 & 16384) != 0 ? oldItem.isPickerButtonVisible : ((MediaPickerButtonVisibilityStateKey) update).getIsVisible());
            return copy2;
        }
        if (!(update instanceof CommentUpdateKey)) {
            return oldItem;
        }
        copy = oldItem.copy((r35 & 1) != 0 ? oldItem.id : 0L, (r35 & 2) != 0 ? oldItem.uploadKey : null, (r35 & 4) != 0 ? oldItem.placeholder : null, (r35 & 8) != 0 ? oldItem.value : ((CommentUpdateKey) update).getText(), (r35 & 16) != 0 ? oldItem.hints : null, (r35 & 32) != 0 ? oldItem.suggests : null, (r35 & 64) != 0 ? oldItem.maxLines : 0, (r35 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldItem.minLines : 0, (r35 & 256) != 0 ? oldItem.maxInputLength : 0, (r35 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldItem.clickTokenizedEvent : null, (r35 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldItem.mediaPickerButton : null, (r35 & 2048) != 0 ? oldItem.isFooterSticky : false, (r35 & 4096) != 0 ? oldItem.isExpanded : false, (r35 & 8192) != 0 ? oldItem.isModal : false, (r35 & 16384) != 0 ? oldItem.isPickerButtonVisible : false);
        return copy;
    }
}
