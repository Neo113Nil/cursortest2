package b2;

import android.os.StatFs;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.g1;
import cd.r;
import com.sports.insider.MyApp;
import e.v;
import e.w;
import ge.t;
import ic.s;
import io.appmetrica.analytics.impl.C0122e9;
import java.io.File;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.FileSystem;
import okio.Path;
import sg.e1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2954a;

    public /* synthetic */ b(int i5) {
        this.f2954a = i5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2954a) {
            case 0:
                return new g1();
            case 1:
                e3.i iVar = new e3.i(5);
                iVar.a(Reflection.getOrCreateKotlinClass(c.class), new a2.j(3));
                return iVar.d();
            case 2:
                return new ce.a();
            case 3:
                return new ce.b();
            case 4:
                return new ce.c();
            case 5:
                return new ce.d();
            case 6:
                return new ce.e();
            case 7:
                return new ce.f();
            case 8:
                return new ce.g();
            case 9:
                return new ce.h();
            case 10:
                return new ce.i();
            case 11:
                return new ce.j();
            case 12:
                jg.d dVar = MyApp.f6830c;
                return new r(6);
            case 13:
                jg.d dVar2 = MyApp.f6830c;
                return new zc.g();
            case 14:
                return new ee.a();
            case 15:
                return new ee.b();
            case 16:
                return new ee.c();
            case 17:
                return new ee.d();
            case 18:
                return new ee.e();
            case 19:
                try {
                    Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                    declaredField.setAccessible(true);
                    Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                    declaredField2.setAccessible(true);
                    Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                    declaredField3.setAccessible(true);
                    Intrinsics.checkNotNull(declaredField3);
                    Intrinsics.checkNotNull(declaredField);
                    Intrinsics.checkNotNull(declaredField2);
                    return new w(declaredField3, declaredField, declaredField2);
                } catch (NoSuchFieldException unused) {
                    return v.f8441a;
                }
            case 20:
                FileSystem fileSystem = FileSystem.SYSTEM;
                kotlin.coroutines.g gVar = kotlin.coroutines.g.f19227a;
                Path resolve = FileSystem.SYSTEM_TEMPORARY_DIRECTORY.resolve("coil3_disk_cache");
                if (resolve == null) {
                    throw new IllegalStateException("directory == null");
                }
                long j = 10485760;
                try {
                    File file = resolve.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    j = zf.j.b((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                } catch (Exception unused2) {
                }
                return new e4.h(j, gVar, fileSystem, resolve);
            case 21:
                return new zc.k();
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                xf.e.f25465a.getClass();
                return Integer.valueOf(xf.e.f25466b.a().nextInt(2147418112) + 65536);
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                return new t();
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return new zc.k();
            case C0122e9.F /* 25 */:
                return new zc.k();
            case C0122e9.G /* 26 */:
                return new zc.k();
            case C0122e9.H /* 27 */:
                return new sg.d(ic.t.f11134c);
            case 28:
                return new sg.d(e1.f23623a);
            default:
                return new sg.d(s.f11133c);
        }
    }
}
