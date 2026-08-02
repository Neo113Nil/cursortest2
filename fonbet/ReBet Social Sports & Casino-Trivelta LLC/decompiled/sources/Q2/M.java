package Q2;

import androidx.work.impl.model.WorkSpec;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: d, reason: collision with root package name */
    public static final b f9243d = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final UUID f9244a;

    /* renamed from: b, reason: collision with root package name */
    public final WorkSpec f9245b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f9246c;

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f9247a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f9248b;

        /* renamed from: c, reason: collision with root package name */
        public UUID f9249c;

        /* renamed from: d, reason: collision with root package name */
        public WorkSpec f9250d;

        /* renamed from: e, reason: collision with root package name */
        public final Set f9251e;

        public a(Class workerClass) {
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            this.f9247a = workerClass;
            UUID randomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
            this.f9249c = randomUUID;
            String uuid = this.f9249c.toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
            String name = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(name, "workerClass.name");
            this.f9250d = new WorkSpec(uuid, name);
            String name2 = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "workerClass.name");
            this.f9251e = SetsKt.mutableSetOf(name2);
        }

        public final M a() {
            M b10 = b();
            C1493d c1493d = this.f9250d.constraints;
            boolean z10 = c1493d.g() || c1493d.h() || c1493d.i() || c1493d.j();
            WorkSpec workSpec = this.f9250d;
            if (workSpec.expedited) {
                if (z10) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (workSpec.initialDelay > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            if (workSpec.getTraceTag() == null) {
                WorkSpec workSpec2 = this.f9250d;
                workSpec2.o(M.f9243d.b(workSpec2.workerClassName));
            }
            UUID randomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
            h(randomUUID);
            return b10;
        }

        public abstract M b();

        public final boolean c() {
            return this.f9248b;
        }

        public final UUID d() {
            return this.f9249c;
        }

        public final Set e() {
            return this.f9251e;
        }

        public abstract a f();

        public final WorkSpec g() {
            return this.f9250d;
        }

        public final a h(UUID id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f9249c = id2;
            String uuid = id2.toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
            this.f9250d = new WorkSpec(uuid, this.f9250d);
            return f();
        }

        public final a i(androidx.work.b inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f9250d.input = inputData;
            return f();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String b(String str) {
            List split$default = StringsKt.split$default((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null);
            String str2 = split$default.size() == 1 ? (String) split$default.get(0) : (String) CollectionsKt.last(split$default);
            return str2.length() <= 127 ? str2 : StringsKt.take(str2, 127);
        }

        public b() {
        }
    }

    public M(UUID id2, WorkSpec workSpec, Set tags) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f9244a = id2;
        this.f9245b = workSpec;
        this.f9246c = tags;
    }

    public UUID a() {
        return this.f9244a;
    }

    public final String b() {
        String uuid = a().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
        return uuid;
    }

    public final Set c() {
        return this.f9246c;
    }

    public final WorkSpec d() {
        return this.f9245b;
    }
}
