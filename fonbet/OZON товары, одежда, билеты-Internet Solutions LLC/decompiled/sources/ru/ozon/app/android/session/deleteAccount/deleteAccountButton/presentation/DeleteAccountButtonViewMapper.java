package ru.ozon.app.android.session.deleteAccount.deleteAccountButton.presentation;

import Pc.a;
import Sc.o;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.session.R$layout;
import ru.ozon.app.android.session.deleteAccount.deleteAccountButton.data.DeleteAccountButtonDTO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R6\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0013j\u0002`\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00150\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR,\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019¨\u0006#"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/data/DeleteAccountButtonDTO;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonVO;", "LPc/a;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewModelImpl;", "pViewModel", "<init>", "(LPc/a;)V", "Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/data/DeleteAccountButtonDTO$Alignment;", "", "toGravity", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/data/DeleteAccountButtonDTO$Alignment;)I", "", "stateId", "toVO", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/data/DeleteAccountButtonDTO;Ljava/lang/String;)Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonVO;", "LPc/a;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonWidgetViewHolder;", "holderProducer", "getHolderProducer", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeleteAccountButtonViewMapper extends WidgetViewMapper<DeleteAccountButtonDTO, DeleteAccountButtonVO> {

    @NotNull
    private final Function2<View, ComposerReferences, DeleteAccountButtonWidgetViewHolder> holderProducer;
    private final int layout;

    @NotNull
    private final Function2<DeleteAccountButtonDTO, d, List<DeleteAccountButtonVO>> mapper;

    @NotNull
    private final a<DeleteAccountButtonViewModelImpl> pViewModel;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeleteAccountButtonDTO.Alignment.values().length];
            try {
                iArr[DeleteAccountButtonDTO.Alignment.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeleteAccountButtonDTO.Alignment.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DeleteAccountButtonViewMapper(@NotNull a<DeleteAccountButtonViewModelImpl> pViewModel) {
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        this.pViewModel = pViewModel;
        this.mapper = new DeleteAccountButtonViewMapper$mapper$1(this);
        this.layout = R$layout.widget_delete_account_button_layout;
        this.holderProducer = new DeleteAccountButtonViewMapper$holderProducer$1(this);
    }

    private final int toGravity(DeleteAccountButtonDTO.Alignment alignment) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
        if (i11 == 1) {
            return 17;
        }
        if (i11 == 2) {
            return 8388627;
        }
        throw new o();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<DeleteAccountButtonVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<DeleteAccountButtonDTO, d, List<DeleteAccountButtonVO>> getMapper() {
        return this.mapper;
    }

    @NotNull
    public final DeleteAccountButtonVO toVO(@NotNull DeleteAccountButtonDTO deleteAccountButtonDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(deleteAccountButtonDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long hashCode = stateId.hashCode();
        String textColor = deleteAccountButtonDTO.getTextColor();
        if (textColor == null) {
            textColor = StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_SECONDARY.getValue();
        }
        String str = textColor;
        return new DeleteAccountButtonVO(hashCode, deleteAccountButtonDTO.getTitle(), deleteAccountButtonDTO.getAction(), toGravity(deleteAccountButtonDTO.getAlignment()), str, deleteAccountButtonDTO.getIcon());
    }
}
