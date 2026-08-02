package qg;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import rg.C9268a;

@e(c = "ru.nspk.mirpay.sdk.api.configuration.provider.MirPayAppStoresProvider", f = "MirPayAppStoresProvider.kt", l = {DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER}, m = "requestAppStores")
/* renamed from: qg.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9055b extends c {

    /* renamed from: d, reason: collision with root package name */
    C9268a f82085d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f82086e;

    /* renamed from: f, reason: collision with root package name */
    int f82087f;

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f82086e = obj;
        this.f82087f |= LinearLayoutManager.INVALID_OFFSET;
        return C9054a.a(null, this);
    }
}
