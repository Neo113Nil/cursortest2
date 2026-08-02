package kc0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import android.content.Context;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kc0.InterfaceC7643a;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc0.C7918a;
import lc0.C7919b;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.credentials.countryCode.PhoneCodeCountrySelectDTO;
import ru.ozon.uni.android.component.sheet.SheetView;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.DisclosureIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsFragment$onShowCountryCodeSelector$lambda$32$$inlined$collectFlow$1", f = "EntryCredentialsFragment.kt", l = {80}, m = "invokeSuspend")
/* renamed from: kc0.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7661t extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f71395d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f71396e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ SheetView f71397f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ RecyclerView f71398g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ ru.ozon.id.nativeauth.credentials.countryCode.a f71399h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Context f71400i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ int f71401j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ int f71402k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ int f71403l;

    /* renamed from: kc0.t$a */
    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SheetView f71404a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecyclerView f71405b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ru.ozon.id.nativeauth.credentials.countryCode.a f71406c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f71407d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f71408e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f71409f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f71410g;

        public a(SheetView sheetView, RecyclerView recyclerView, ru.ozon.id.nativeauth.credentials.countryCode.a aVar, Context context, int i11, int i12, int i13) {
            this.f71404a = sheetView;
            this.f71405b = recyclerView;
            this.f71406c = aVar;
            this.f71407d = context;
            this.f71408e = i11;
            this.f71409f = i12;
            this.f71410g = i13;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            InterfaceC7643a.d.AbstractC1168a abstractC1168a = (InterfaceC7643a.d.AbstractC1168a) t2;
            if (Intrinsics.d(abstractC1168a, InterfaceC7643a.d.AbstractC1168a.C1169a.f71317a)) {
                this.f71404a.dismiss();
            } else {
                if (!(abstractC1168a instanceof InterfaceC7643a.d.AbstractC1168a.b)) {
                    throw new Sc.o();
                }
                PhoneCodeCountrySelectDTO a11 = ((InterfaceC7643a.d.AbstractC1168a.b) abstractC1168a).a();
                String title = a11.getNavBar().getTitle();
                Context context = this.f71407d;
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, this.f71408e));
                appCompatTextView.setPadding(0, this.f71409f, 0, this.f71410g);
                appCompatTextView.setGravity(17);
                appCompatTextView.setBackgroundResource(R.color.layer_floor_2);
                appCompatTextView.setTextAppearance(UniTextStyles.COMPACT_CONTROL_500_MEDIUM.getResId());
                appCompatTextView.setText(title);
                C7918a c7918a = new C7918a(context);
                RecyclerView recyclerView = this.f71405b;
                recyclerView.addItemDecoration(c7918a);
                recyclerView.addItemDecoration(new C7919b(appCompatTextView));
                recyclerView.setBackgroundResource(R.color.layer_floor_2);
                List<PhoneCodeCountrySelectDTO.CountrySelect> countrySelect = a11.getCountrySelect();
                Intrinsics.checkNotNullParameter(countrySelect, "<this>");
                List<PhoneCodeCountrySelectDTO.CountrySelect> list = countrySelect;
                ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
                for (PhoneCodeCountrySelectDTO.CountrySelect countrySelect2 : list) {
                    arrayList.add(new DisclosureIconTitleSubtitleCellDTO(DisclosureIconTitleSubtitleCellDTO.DisclosureIconTitleSubtitleCellPreset.NO_SHAPE_500_TOP_START_500_DEFAULT_500, new CommonCellSettings(null, null, null, null, new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, countrySelect2.getLink(), null, null, 12, null), null, null, 15, null), new CommonAtomLabelDTO(OzonSpannableStringKt.toOzonSpannableString(countrySelect2.getTitle()), null, null, null, null, null, null, false, null, 510, null), null, countrySelect2.isSelected() ? new CommonAtomIconDTO("ic_m_check", UniColors.GRAPHIC_TERTIARY.getToken()) : null, null));
                }
                this.f71406c.setItems(arrayList);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7661t(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, SheetView sheetView, RecyclerView recyclerView, ru.ozon.id.nativeauth.credentials.countryCode.a aVar, Context context, int i11, int i12, int i13) {
        super(2, dVar);
        this.f71396e = interfaceC2395h;
        this.f71397f = sheetView;
        this.f71398g = recyclerView;
        this.f71399h = aVar;
        this.f71400i = context;
        this.f71401j = i11;
        this.f71402k = i12;
        this.f71403l = i13;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C7661t(this.f71396e, dVar, this.f71397f, this.f71398g, this.f71399h, this.f71400i, this.f71401j, this.f71402k, this.f71403l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C7661t) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f71395d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f71397f, this.f71398g, this.f71399h, this.f71400i, this.f71401j, this.f71402k, this.f71403l);
            this.f71395d = 1;
            if (this.f71396e.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
