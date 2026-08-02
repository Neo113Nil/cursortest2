package oe0;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.locationProvider.SmartLocationPicker", f = "SmartLocationPicker.kt", l = {111, 117}, m = "getCurrentLocationSuspend")
/* renamed from: oe0.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8703B extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    J f78104d;

    /* renamed from: e, reason: collision with root package name */
    ze.h f78105e;

    /* renamed from: f, reason: collision with root package name */
    List f78106f;

    /* renamed from: g, reason: collision with root package name */
    List f78107g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f78108h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ J f78109i;

    /* renamed from: j, reason: collision with root package name */
    int f78110j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8703B(J j11, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f78109i = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f78108h = obj;
        this.f78110j |= LinearLayoutManager.INVALID_OFFSET;
        return this.f78109i.a(null, this);
    }
}
