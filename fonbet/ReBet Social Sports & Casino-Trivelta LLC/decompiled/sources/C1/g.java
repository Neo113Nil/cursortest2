package C1;

import e2.C4166h;
import e2.l;
import e2.s;
import f2.C4234a;
import f2.C4236c;
import java.util.Objects;

/* loaded from: classes.dex */
public interface g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f1070a = new a();

    public class a implements g {

        /* renamed from: b, reason: collision with root package name */
        public final C4166h f1071b = new C4166h();

        @Override // C1.g
        public boolean a(androidx.media3.common.a aVar) {
            String str = aVar.f20543o;
            return this.f1071b.a(aVar) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
        }

        @Override // C1.g
        public l b(androidx.media3.common.a aVar) {
            String str = aVar.f20543o;
            if (str != null) {
                switch (str) {
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new C4234a(str, aVar.f20523K, 16000L);
                    case "application/cea-708":
                        return new C4236c(aVar.f20523K, aVar.f20546r);
                }
            }
            if (!this.f1071b.a(aVar)) {
                throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
            }
            s c10 = this.f1071b.c(aVar);
            return new b(c10.getClass().getSimpleName() + "Decoder", c10);
        }
    }

    boolean a(androidx.media3.common.a aVar);

    l b(androidx.media3.common.a aVar);
}
