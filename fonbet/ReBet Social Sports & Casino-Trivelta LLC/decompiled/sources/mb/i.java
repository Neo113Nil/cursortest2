package mb;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* loaded from: classes3.dex */
public interface i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f56455a = new i() { // from class: mb.h
        @Override // mb.i
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List a(ComponentRegistrar componentRegistrar);
}
