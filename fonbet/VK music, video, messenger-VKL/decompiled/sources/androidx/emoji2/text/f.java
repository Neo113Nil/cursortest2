package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.emoji2.text.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import xsna.d6s;
import xsna.fs2;
import xsna.g5s;
import xsna.j5s;
import xsna.lwi;
import xsna.obr;
import xsna.tgw;

/* compiled from: FontRequestEmojiCompatConfig.java */
/* loaded from: classes12.dex */
public final class f extends c.AbstractC0029c {
    public static final a d = new a();

    /* compiled from: FontRequestEmojiCompatConfig.java */
    public static class a {
    }

    /* compiled from: FontRequestEmojiCompatConfig.java */
    public static class b implements c.h {

        @NonNull
        public final Context a;

        @NonNull
        public final j5s b;

        @NonNull
        public final a c;

        @NonNull
        public final Object d = new Object();

        @Nullable
        public Handler e;

        @Nullable
        public ThreadPoolExecutor f;

        @Nullable
        public ThreadPoolExecutor g;

        @Nullable
        public c.i h;

        public b(@NonNull Context context, @NonNull j5s j5sVar) {
            obr.e(context, "Context cannot be null");
            this.a = context.getApplicationContext();
            this.b = j5sVar;
            this.c = f.d;
        }

        @Override // androidx.emoji2.text.c.h
        public final void a(@NonNull c.i iVar) {
            synchronized (this.d) {
                this.h = iVar;
            }
            synchronized (this.d) {
                try {
                    if (this.h == null) {
                        return;
                    }
                    if (this.f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new lwi("emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.g = threadPoolExecutor;
                        this.f = threadPoolExecutor;
                    }
                    this.f.execute(new fs2(this, 7));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            synchronized (this.d) {
                try {
                    this.h = null;
                    Handler handler = this.e;
                    if (handler != null) {
                        handler.removeCallbacks(null);
                    }
                    this.e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f = null;
                    this.g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final d6s.b c() {
            try {
                a aVar = this.c;
                Context context = this.a;
                j5s j5sVar = this.b;
                aVar.getClass();
                Object[] objArr = {j5sVar};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                d6s.a a = g5s.a(context, Collections.unmodifiableList(arrayList));
                int i = a.a;
                if (i != 0) {
                    throw new RuntimeException(tgw.b(i, "fetchFonts failed (", ")"));
                }
                d6s.b[] bVarArr = a.b.get(0);
                if (bVarArr == null || bVarArr.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return bVarArr[0];
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }
    }
}
