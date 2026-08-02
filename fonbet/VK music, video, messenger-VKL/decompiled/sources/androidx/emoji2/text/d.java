package androidx.emoji2.text;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.emoji2.text.c;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: EmojiCompatInitializer.java */
/* loaded from: classes12.dex */
public final class d extends c.i {
    public final /* synthetic */ c.i a;
    public final /* synthetic */ ThreadPoolExecutor b;

    public d(c.i iVar, ThreadPoolExecutor threadPoolExecutor) {
        this.a = iVar;
        this.b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.c.i
    public final void a(@Nullable Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.a(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // androidx.emoji2.text.c.i
    public final void b(@NonNull g gVar) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.b(gVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
