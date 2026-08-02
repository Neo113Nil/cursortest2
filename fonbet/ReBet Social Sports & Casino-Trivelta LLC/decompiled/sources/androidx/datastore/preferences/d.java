package androidx.datastore.preferences;

import I0.C1339d;
import androidx.datastore.preferences.protobuf.C2150z;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f19388a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(InputStream input) {
            Intrinsics.checkNotNullParameter(input, "input");
            try {
                f R10 = f.R(input);
                Intrinsics.checkNotNullExpressionValue(R10, "{\n                Prefer…From(input)\n            }");
                return R10;
            } catch (C2150z e10) {
                throw new C1339d("Unable to parse preferences proto.", e10);
            }
        }

        public a() {
        }
    }
}
