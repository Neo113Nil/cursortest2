package ru.ozon.app.android.orderdetails.cheques.presentation.cheque;

import Bm.C2665a;
import Lh.b;
import android.content.Context;
import android.text.style.UnderlineSpan;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.orderdetails.R$layout;
import ru.ozon.app.android.orderdetails.cheques.data.ChequesDTO;
import ru.ozon.app.android.orderdetails.cheques.data.ChequesItemDTO;
import ru.ozon.app.android.orderdetails.cheques.di.ChequeComponent;
import ru.ozon.app.android.orderdetails.cheques.presentation.decoration.ChequesBackgroundDecoration;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR2\u0010\"\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R,\u0010.\u001a\u0014\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b/\u0010%¨\u00060"}, d2 = {"Lru/ozon/app/android/orderdetails/cheques/presentation/cheque/ChequeViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/orderdetails/cheques/di/ChequeComponent;", "Lru/ozon/app/android/orderdetails/cheques/data/ChequesDTO;", "Lru/ozon/app/android/orderdetails/cheques/presentation/cheque/ChequeVO;", "<init>", "()V", "", "stateId", "", "toVO", "(Lru/ozon/app/android/orderdetails/cheques/data/ChequesDTO;Ljava/lang/String;)Ljava/util/List;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "mapTitle", "(Ljava/lang/String;)Ljava/lang/CharSequence;", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/orderdetails/cheques/presentation/cheque/ChequeVO;Lru/ozon/app/android/orderdetails/cheques/presentation/cheque/ChequeVO;)V", "Landroid/content/Context;", "context", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/orderdetails/cheques/presentation/cheque/ChequeWidgetViewHolder;", "holderProducer", "getHolderProducer", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChequeViewMapper extends WidgetViewMapper2<ChequeComponent, ChequesDTO, ChequeVO> {

    @NotNull
    private final Function2<ChequesDTO, d, List<ChequeVO>> mapper = new ChequeViewMapper$mapper$1(this);
    private final int layout = R$layout.widget_cheques_layout;

    @NotNull
    private final Function2<View, ComposerReferences, ChequeWidgetViewHolder> holderProducer = ChequeViewMapper$holderProducer$1.INSTANCE;

    private final CharSequence mapTitle(String title) {
        if (component().getAppType() != AppType.SELECT) {
            return title;
        }
        OzonSpannableString ozonSpannableString = new OzonSpannableString(title);
        ozonSpannableString.setSpan(new UnderlineSpan(), 0, title.length(), 17);
        return ozonSpannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ChequeVO> toVO(ChequesDTO chequesDTO, String str) {
        List<ChequesItemDTO> cheques = chequesDTO.getCheques();
        ArrayList arrayList = new ArrayList(C7714v.z(cheques, 10));
        int i11 = 0;
        for (Object obj : cheques) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ChequesItemDTO chequesItemDTO = (ChequesItemDTO) obj;
            long a11 = b.a(i11, str, "_cheque_");
            CharSequence mapTitle = mapTitle(chequesItemDTO.getTitle());
            String subtitle = chequesItemDTO.getSubtitle();
            String deeplink = chequesItemDTO.getDeeplink();
            arrayList.add(new ChequeVO(a11, mapTitle, deeplink != null ? new AtomAction.Move(deeplink, null, chequesItemDTO.getTrackingInfo(), null, 10, null) : null, subtitle, chequesItemDTO.getPrice(), chequesItemDTO.getButton()));
            i11 = i12;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChequeComponent widgetComponent$lambda$0(C7475g c7475g) {
        return ChequeComponent.INSTANCE.create(c7475g);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new ChequesBackgroundDecoration(context));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, ChequeWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<ChequesDTO, d, List<ChequeVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Object getPayload(c cVar, c cVar2) {
        getPayload((ChequeVO) cVar, (ChequeVO) cVar2);
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ChequeComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(ChequeComponent.class), new C2665a(storage, 5));
    }

    public void getPayload(@NotNull ChequeVO oldItem, @NotNull ChequeVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
    }
}
