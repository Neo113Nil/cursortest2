package ob0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.antibot.AntibotActionHandler", f = "AntibotActionHandler.kt", l = {ModuleDescriptor.MODULE_VERSION, 237, 247, 249, 252}, m = "onFlowEnd")
/* renamed from: ob0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8690e extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    l f77930d;

    /* renamed from: e, reason: collision with root package name */
    s f77931e;

    /* renamed from: f, reason: collision with root package name */
    Object f77932f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f77933g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ l f77934h;

    /* renamed from: i, reason: collision with root package name */
    int f77935i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8690e(l lVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f77934h = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m11;
        this.f77933g = obj;
        this.f77935i |= LinearLayoutManager.INVALID_OFFSET;
        m11 = this.f77934h.m(null, null, null, null, this);
        return m11;
    }
}
