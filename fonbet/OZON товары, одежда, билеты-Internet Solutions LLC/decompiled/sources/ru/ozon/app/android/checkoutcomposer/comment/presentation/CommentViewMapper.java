package ru.ozon.app.android.checkoutcomposer.comment.presentation;

import A00.a;
import V.e;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.deprecated.Input;
import ru.ozon.app.android.checkout.R$layout;
import ru.ozon.app.android.checkoutcomposer.comment.data.CommentModels;
import ru.ozon.app.android.checkoutcomposer.comment.data.CommentVO;
import ru.ozon.app.android.checkoutcomposer.comment.di.CommentWidgetComponent;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R2\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00140\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR2\u0010!\u001a\u001a\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030 0\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018R(\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0#0\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/comment/presentation/CommentViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/checkoutcomposer/comment/data/CommentModels;", "Lru/ozon/app/android/checkoutcomposer/comment/data/CommentVO;", "Lru/ozon/app/android/checkoutcomposer/comment/di/CommentWidgetComponent;", "component", "<init>", "(Lru/ozon/app/android/checkoutcomposer/comment/di/CommentWidgetComponent;)V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/checkoutcomposer/comment/data/CommentVO;)Lru/ozon/app/android/checkoutcomposer/comment/data/CommentVO;", "newItem", "", "getPayload", "(Lru/ozon/app/android/checkoutcomposer/comment/data/CommentVO;Lru/ozon/app/android/checkoutcomposer/comment/data/CommentVO;)Ljava/lang/Object;", "Lru/ozon/app/android/checkoutcomposer/comment/di/CommentWidgetComponent;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "getHolderProducer", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "UpdateComment", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CommentViewMapper extends WidgetViewMapper<CommentModels, CommentVO> {

    @NotNull
    private final CommentWidgetComponent component;

    @NotNull
    private final Function2<View, ComposerReferences, k<CommentVO>> holderProducer;
    private final int layout;

    @NotNull
    private final Function2<CommentModels, d, List<CommentVO>> mapper;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/comment/presentation/CommentViewMapper$UpdateComment;", "LA00/a$J$a;", "", "newText", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNewText", "getErrorMessage", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateComment implements a.J.InterfaceC0007a {
        private final String errorMessage;
        private final String newText;

        public UpdateComment(String str, String str2) {
            this.newText = str;
            this.errorMessage = str2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateComment)) {
                return false;
            }
            UpdateComment updateComment = (UpdateComment) other;
            return Intrinsics.d(this.newText, updateComment.newText) && Intrinsics.d(this.errorMessage, updateComment.errorMessage);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final String getNewText() {
            return this.newText;
        }

        public int hashCode() {
            String str = this.newText;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.errorMessage;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return e.a("UpdateComment(newText=", this.newText, ", errorMessage=", this.errorMessage, ")");
        }

        public /* synthetic */ UpdateComment(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, str2);
        }
    }

    public CommentViewMapper(@NotNull CommentWidgetComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.mapper = CommentViewMapper$mapper$1.INSTANCE;
        this.layout = R$layout.widget_comment;
        this.holderProducer = new CommentViewMapper$holderProducer$1(this);
        this.supportedUpdates = C7714v.a0(UpdateComment.class);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<CommentVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<CommentModels, d, List<CommentVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Object getPayload(@NotNull CommentVO oldItem, @NotNull CommentVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public CommentVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull CommentVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        AtomDTO input = oldItem.getInput();
        Input input2 = input instanceof Input ? (Input) input : null;
        if (input2 == null) {
            return null;
        }
        UpdateComment updateComment = (UpdateComment) update;
        String errorMessage = updateComment.getErrorMessage();
        String newText = updateComment.getNewText();
        if (newText == null) {
            newText = input2.getText();
        }
        return CommentVO.copy$default(oldItem, 0L, null, Input.copy$default(input2, null, null, newText, errorMessage, null, null, null, 115, null), null, 11, null);
    }
}
