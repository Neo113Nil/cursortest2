package com.playtika.sharedsdk.shaded.okhttp3.internal.publicsuffix;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.playtika.sharedsdk.shaded.okio.FileSystem;
import com.playtika.sharedsdk.shaded.okio.Path;
import com.playtika.sharedsdk.shaded.okio.Source;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResourcePublicSuffixList.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/playtika/sharedsdk/shaded/okhttp3/internal/publicsuffix/ResourcePublicSuffixList;", "Lcom/playtika/sharedsdk/shaded/okhttp3/internal/publicsuffix/BasePublicSuffixList;", "path", "Lcom/playtika/sharedsdk/shaded/okio/Path;", "fileSystem", "Lcom/playtika/sharedsdk/shaded/okio/FileSystem;", "<init>", "(Lokio/Path;Lokio/FileSystem;)V", "getPath", "()Lokio/Path;", "getFileSystem", "()Lokio/FileSystem;", "listSource", "Lcom/playtika/sharedsdk/shaded/okio/Source;", k.M, "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ResourcePublicSuffixList extends BasePublicSuffixList {
    public static final Path PUBLIC_SUFFIX_RESOURCE = Path.Companion.get$default(Path.INSTANCE, "com/playtika/sharedsdk/shaded/okhttp3/internal/publicsuffix/PublicSuffixDatabase.list", false, 1, (Object) null);
    private final FileSystem fileSystem;
    private final Path path;

    /* JADX WARN: Multi-variable type inference failed */
    public ResourcePublicSuffixList() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public ResourcePublicSuffixList(Path path, FileSystem fileSystem) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        this.path = path;
        this.fileSystem = fileSystem;
    }

    public /* synthetic */ ResourcePublicSuffixList(Path path, FileSystem fileSystem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PUBLIC_SUFFIX_RESOURCE : path, (i & 2) != 0 ? FileSystem.RESOURCES : fileSystem);
    }

    @Override // com.playtika.sharedsdk.shaded.okhttp3.internal.publicsuffix.BasePublicSuffixList
    public Path getPath() {
        return this.path;
    }

    public final FileSystem getFileSystem() {
        return this.fileSystem;
    }

    @Override // com.playtika.sharedsdk.shaded.okhttp3.internal.publicsuffix.BasePublicSuffixList
    public Source listSource() {
        return this.fileSystem.source(getPath());
    }
}
