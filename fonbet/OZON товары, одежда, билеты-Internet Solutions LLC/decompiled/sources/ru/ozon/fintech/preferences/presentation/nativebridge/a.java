package ru.ozon.fintech.preferences.presentation.nativebridge;

import Ca.i;
import D90.g;
import Sc.s;
import android.R;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@e(c = "ru.ozon.fintech.preferences.presentation.nativebridge.FintechNativeBridgeTestingFragment$loadPresets$1", f = "FintechNativeBridgeTestingFragment.kt", l = {UserVerificationMethods.USER_VERIFY_PATTERN}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f96857d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ FintechNativeBridgeTestingFragment f96858e;

    /* renamed from: ru.ozon.fintech.preferences.presentation.nativebridge.a$a, reason: collision with other inner class name */
    public static final class C2119a implements AdapterView.OnItemSelectedListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FintechNativeBridgeTestingFragment f96859a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map<String, String> f96860b;

        C2119a(FintechNativeBridgeTestingFragment fintechNativeBridgeTestingFragment, Map<String, String> map) {
            this.f96859a = fintechNativeBridgeTestingFragment;
            this.f96860b = map;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> parent, View view, int i11, long j11) {
            ArrayAdapter arrayAdapter;
            String str;
            v90.j jVar;
            Intrinsics.checkNotNullParameter(parent, "parent");
            FintechNativeBridgeTestingFragment fintechNativeBridgeTestingFragment = this.f96859a;
            arrayAdapter = fintechNativeBridgeTestingFragment.f96851h;
            if (arrayAdapter == null || (str = (String) arrayAdapter.getItem(i11)) == null) {
                return;
            }
            String str2 = this.f96860b.get(str);
            if (str2 == null) {
                str2 = "";
            }
            jVar = fintechNativeBridgeTestingFragment.f96849f;
            if (jVar != null) {
                jVar.f102686h.setText(str2);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(FintechNativeBridgeTestingFragment fintechNativeBridgeTestingFragment, kotlin.coroutines.d<? super a> dVar) {
        super(2, dVar);
        this.f96858e = fintechNativeBridgeTestingFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new a(this.f96858e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        v90.j jVar;
        v90.j jVar2;
        ArrayAdapter arrayAdapter;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f96857d;
        FintechNativeBridgeTestingFragment fintechNativeBridgeTestingFragment = this.f96858e;
        if (i11 == 0) {
            s.b(obj);
            D90.j A11 = FintechNativeBridgeTestingFragment.A(fintechNativeBridgeTestingFragment);
            g gVar = new g(fintechNativeBridgeTestingFragment, 0);
            i iVar = new i(fintechNativeBridgeTestingFragment, 1);
            this.f96857d = 1;
            A11.getClass();
            C10720e0 c10720e0 = C10720e0.f105451a;
            obj = C10727i.f(He.b.f10879b, new d(gVar, "", iVar, A11, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        Map map = (Map) obj;
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(fintechNativeBridgeTestingFragment.requireContext(), R.layout.simple_spinner_item, C7714v.U0(map.keySet()));
        arrayAdapter2.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        fintechNativeBridgeTestingFragment.f96851h = arrayAdapter2;
        jVar = fintechNativeBridgeTestingFragment.f96849f;
        if (jVar != null) {
            Spinner spinner = jVar.f102689k;
            arrayAdapter = fintechNativeBridgeTestingFragment.f96851h;
            spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        }
        jVar2 = fintechNativeBridgeTestingFragment.f96849f;
        if (jVar2 != null) {
            jVar2.f102689k.setOnItemSelectedListener(new C2119a(fintechNativeBridgeTestingFragment, map));
        }
        return Unit.f71690a;
    }
}
