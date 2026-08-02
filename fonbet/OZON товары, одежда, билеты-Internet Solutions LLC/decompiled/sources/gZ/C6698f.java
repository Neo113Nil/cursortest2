package gZ;

import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.cdn.chooser.internal.domain.CdnChooserNewConfigInteractor", f = "CdnChooserNewConfigInteractor.kt", l = {DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "getNewCdnChooserConfig-IoAF18A")
/* renamed from: gZ.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C6698f extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C6699g f64184d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f64185e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C6699g f64186f;

    /* renamed from: g, reason: collision with root package name */
    int f64187g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6698f(C6699g c6699g, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f64186f = c6699g;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f64185e = obj;
        this.f64187g |= LinearLayoutManager.INVALID_OFFSET;
        Object a11 = this.f64186f.a(this);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : r.a(a11);
    }
}
