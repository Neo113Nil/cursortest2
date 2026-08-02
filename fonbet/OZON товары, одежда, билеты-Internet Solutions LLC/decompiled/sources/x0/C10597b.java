package x0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier", f = "AwaitFirstLayoutModifier.kt", l = {DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER}, m = "waitForFirstLayout")
/* renamed from: x0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10597b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    kotlin.coroutines.h f104725d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f104726e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10598c f104727f;

    /* renamed from: g, reason: collision with root package name */
    int f104728g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10597b(C10598c c10598c, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f104727f = c10598c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f104726e = obj;
        this.f104728g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f104727f.a(this);
    }
}
