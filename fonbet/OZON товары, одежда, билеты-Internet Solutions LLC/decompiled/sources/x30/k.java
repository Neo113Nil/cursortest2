package x30;

import Ae.InterfaceC2397i;
import Sc.s;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k<T> implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2397i f105005a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f105006b;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.antifraud.internal.domain.screen.ScreenshotManager$startScreenshotDetection$1$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "ScreenshotManager.kt", l = {227}, m = "emit")
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f105007d;

        /* renamed from: e, reason: collision with root package name */
        int f105008e;

        public a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f105007d = obj;
            this.f105008e |= LinearLayoutManager.INVALID_OFFSET;
            return k.this.emit(null, this);
        }
    }

    public k(InterfaceC2397i interfaceC2397i, j jVar) {
        this.f105005a = interfaceC2397i;
        this.f105006b = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
        a aVar;
        int i11;
        Context context;
        String str;
        String str2;
        String str3;
        Cursor query;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f105008e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f105008e = i12 - LinearLayoutManager.INVALID_OFFSET;
                a aVar2 = aVar;
                Object obj2 = aVar2.f105007d;
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar2.f105008e;
                if (i11 != 0) {
                    s.b(obj2);
                    Uri uri = (Uri) obj;
                    context = this.f105006b.f104995a;
                    String str4 = null;
                    try {
                        query = context.getContentResolver().query(uri, new String[]{"_display_name", "_data"}, null, null, null);
                    } catch (Exception e11) {
                        L80.a.c("ScreenShotManager", null, e11);
                    }
                    if (query != null) {
                        query.moveToFirst();
                        int columnIndex = query.getColumnIndex("_data");
                        Integer valueOf = Integer.valueOf(columnIndex);
                        if (columnIndex <= 0) {
                            valueOf = null;
                        }
                        if (valueOf != null && (str = query.getString(valueOf.intValue())) != null) {
                            query.close();
                            if (str != null) {
                                String lowerCase = str.toLowerCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                if (Build.VERSION.SDK_INT >= 29) {
                                    str3 = Environment.DIRECTORY_SCREENSHOTS;
                                    str2 = Environment.getExternalStoragePublicDirectory(str3).getName();
                                } else {
                                    str2 = null;
                                }
                                if (str2 != null && (kotlin.text.h.t(lowerCase, str2, false) || kotlin.text.h.t(lowerCase, "screenshot", false))) {
                                    str4 = str;
                                }
                            }
                            if (str4 != null) {
                                aVar2.f105008e = 1;
                                if (this.f105005a.emit(str4, aVar2) == aVar3) {
                                    return aVar3;
                                }
                            }
                        }
                    }
                    str = null;
                    if (str != null) {
                    }
                    if (str4 != null) {
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj2);
                }
                return Unit.f71690a;
            }
        }
        aVar = new a(dVar);
        a aVar22 = aVar;
        Object obj22 = aVar22.f105007d;
        Wc.a aVar32 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar22.f105008e;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }
}
