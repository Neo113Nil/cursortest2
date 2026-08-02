package ru.ozon.fintech.preferences.presentation.nativebridge;

import android.view.View;
import android.widget.AdapterView;
import java.util.ArrayList;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FintechNativeBridgeTestingFragment f96864a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ArrayList f96865b;

    c(FintechNativeBridgeTestingFragment fintechNativeBridgeTestingFragment, ArrayList arrayList) {
        this.f96864a = fintechNativeBridgeTestingFragment;
        this.f96865b = arrayList;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> parent, View view, int i11, long j11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        String str = (String) C7714v.Q(i11, this.f96865b);
        if (str == null) {
            str = "";
        }
        FintechNativeBridgeTestingFragment fintechNativeBridgeTestingFragment = this.f96864a;
        fintechNativeBridgeTestingFragment.H(str);
        FintechNativeBridgeTestingFragment.D(fintechNativeBridgeTestingFragment);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
    }
}
