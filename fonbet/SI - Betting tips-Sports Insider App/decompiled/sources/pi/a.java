package pi;

import androidx.appcompat.widget.a0;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import i2.d;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import oi.l;
import oi.m;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class a extends l {

    /* renamed from: a, reason: collision with root package name */
    public final j f21891a;

    public a(j jVar) {
        this.f21891a = jVar;
    }

    @Override // oi.l
    public final m a(Type type) {
        TypeToken<?> typeToken = TypeToken.get(type);
        j jVar = this.f21891a;
        return new b(jVar, jVar.c(typeToken));
    }

    @Override // oi.l
    public final m b(Type type, Annotation[] annotationArr, a0 a0Var) {
        TypeToken<?> typeToken = TypeToken.get(type);
        j jVar = this.f21891a;
        return new d(jVar, jVar.c(typeToken));
    }
}
