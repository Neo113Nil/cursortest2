package okio.internal;

import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import mf.c;
import mf.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@e(c = "okio.internal.-FileSystem", f = "FileSystem.kt", l = {BuildConfig.API_LEVEL, 135, 145}, m = "collectRecursively", v = 1)
/* renamed from: okio.internal.-FileSystem$collectRecursively$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class FileSystem$collectRecursively$1 extends c {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;

    public FileSystem$collectRecursively$1(Continuation<? super FileSystem$collectRecursively$1> continuation) {
        super(continuation);
    }

    @Override // mf.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FileSystem.collectRecursively(null, null, null, null, false, false, this);
    }
}
