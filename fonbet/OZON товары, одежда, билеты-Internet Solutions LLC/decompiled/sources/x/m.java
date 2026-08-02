package x;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final c f104656a;

    private static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final SessionConfiguration f104657a;

        /* renamed from: b, reason: collision with root package name */
        private final List<g> f104658b;

        a(int i11, @NonNull ArrayList arrayList, @NonNull Executor executor, @NonNull CameraCaptureSession.StateCallback stateCallback) {
            SessionConfiguration sessionConfiguration = new SessionConfiguration(i11, m.h(arrayList), executor, stateCallback);
            this.f104657a = sessionConfiguration;
            List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
            ArrayList arrayList2 = new ArrayList(outputConfigurations.size());
            Iterator<OutputConfiguration> it = outputConfigurations.iterator();
            while (it.hasNext()) {
                arrayList2.add(g.j(it.next()));
            }
            this.f104658b = Collections.unmodifiableList(arrayList2);
        }

        @Override // x.m.c
        public final f a() {
            return f.b(this.f104657a.getInputConfiguration());
        }

        @Override // x.m.c
        @NonNull
        public final CameraCaptureSession.StateCallback b() {
            return this.f104657a.getStateCallback();
        }

        @Override // x.m.c
        @NonNull
        public final List<g> c() {
            return this.f104658b;
        }

        @Override // x.m.c
        public final void d(@NonNull f fVar) {
            this.f104657a.setInputConfiguration((InputConfiguration) fVar.a());
        }

        @Override // x.m.c
        public final Object e() {
            return this.f104657a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return Objects.equals(this.f104657a, ((a) obj).f104657a);
            }
            return false;
        }

        @Override // x.m.c
        public final int f() {
            return this.f104657a.getSessionType();
        }

        @Override // x.m.c
        public final void g(@NonNull CaptureRequest captureRequest) {
            this.f104657a.setSessionParameters(captureRequest);
        }

        @Override // x.m.c
        @NonNull
        public final Executor getExecutor() {
            return this.f104657a.getExecutor();
        }

        public final int hashCode() {
            return this.f104657a.hashCode();
        }
    }

    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final List<g> f104659a;

        /* renamed from: b, reason: collision with root package name */
        private final CameraCaptureSession.StateCallback f104660b;

        /* renamed from: c, reason: collision with root package name */
        private final Executor f104661c;

        /* renamed from: d, reason: collision with root package name */
        private final int f104662d;

        /* renamed from: e, reason: collision with root package name */
        private f f104663e = null;

        b(int i11, @NonNull ArrayList arrayList, @NonNull Executor executor, @NonNull CameraCaptureSession.StateCallback stateCallback) {
            this.f104662d = i11;
            this.f104659a = Collections.unmodifiableList(new ArrayList(arrayList));
            this.f104660b = stateCallback;
            this.f104661c = executor;
        }

        @Override // x.m.c
        public final f a() {
            return this.f104663e;
        }

        @Override // x.m.c
        @NonNull
        public final CameraCaptureSession.StateCallback b() {
            return this.f104660b;
        }

        @Override // x.m.c
        @NonNull
        public final List<g> c() {
            return this.f104659a;
        }

        @Override // x.m.c
        public final void d(@NonNull f fVar) {
            if (this.f104662d == 1) {
                throw new UnsupportedOperationException("Method not supported for high speed session types");
            }
            this.f104663e = fVar;
        }

        @Override // x.m.c
        public final Object e() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Objects.equals(this.f104663e, bVar.f104663e) && this.f104662d == bVar.f104662d) {
                    List<g> list = this.f104659a;
                    int size = list.size();
                    List<g> list2 = bVar.f104659a;
                    if (size == list2.size()) {
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (!list.get(i11).equals(list2.get(i11))) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // x.m.c
        public final int f() {
            return this.f104662d;
        }

        @Override // x.m.c
        public final void g(@NonNull CaptureRequest captureRequest) {
        }

        @Override // x.m.c
        @NonNull
        public final Executor getExecutor() {
            return this.f104661c;
        }

        public final int hashCode() {
            int hashCode = this.f104659a.hashCode() ^ 31;
            int i11 = (hashCode << 5) - hashCode;
            f fVar = this.f104663e;
            int hashCode2 = (fVar == null ? 0 : fVar.hashCode()) ^ i11;
            return this.f104662d ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    private interface c {
        f a();

        @NonNull
        CameraCaptureSession.StateCallback b();

        @NonNull
        List<g> c();

        void d(@NonNull f fVar);

        Object e();

        int f();

        void g(@NonNull CaptureRequest captureRequest);

        @NonNull
        Executor getExecutor();
    }

    public m(int i11, @NonNull ArrayList arrayList, @NonNull Executor executor, @NonNull CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f104656a = new b(i11, arrayList, executor, stateCallback);
        } else {
            this.f104656a = new a(i11, arrayList, executor, stateCallback);
        }
    }

    @NonNull
    public static ArrayList h(@NonNull List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) ((g) it.next()).i());
        }
        return arrayList;
    }

    @NonNull
    public final Executor a() {
        return this.f104656a.getExecutor();
    }

    public final f b() {
        return this.f104656a.a();
    }

    @NonNull
    public final List<g> c() {
        return this.f104656a.c();
    }

    public final int d() {
        return this.f104656a.f();
    }

    @NonNull
    public final CameraCaptureSession.StateCallback e() {
        return this.f104656a.b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        return this.f104656a.equals(((m) obj).f104656a);
    }

    public final void f(@NonNull f fVar) {
        this.f104656a.d(fVar);
    }

    public final void g(@NonNull CaptureRequest captureRequest) {
        this.f104656a.g(captureRequest);
    }

    public final int hashCode() {
        return this.f104656a.hashCode();
    }

    public final Object i() {
        return this.f104656a.e();
    }
}
