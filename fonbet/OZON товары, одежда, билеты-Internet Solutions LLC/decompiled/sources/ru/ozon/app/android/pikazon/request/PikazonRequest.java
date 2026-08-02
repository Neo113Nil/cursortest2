package ru.ozon.app.android.pikazon.request;

import com.bumptech.glide.c;
import com.bumptech.glide.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.request.target.PikazonTarget;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B=\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\u0013R\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001f\u0010(\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020,8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/pikazon/request/PikazonRequest;", "Resource", "", "", "uuid", "source", "Ljava/lang/Class;", "resourceType", "", "isNetworkUrl", "Lru/ozon/app/android/pikazon/request/PikazonRequestBuilder;", "builder", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Class;ZLru/ozon/app/android/pikazon/request/PikazonRequestBuilder;)V", "", "load", "()V", "cancel", "newBuilder", "()Lru/ozon/app/android/pikazon/request/PikazonRequestBuilder;", "Ljava/lang/String;", "getUuid", "()Ljava/lang/String;", "Ljava/lang/Object;", "getSource", "()Ljava/lang/Object;", "Ljava/lang/Class;", "getResourceType$lib_release", "()Ljava/lang/Class;", "Z", "isNetworkUrl$lib_release", "()Z", "Lru/ozon/app/android/pikazon/request/PikazonRequestBuilder;", "getBuilder$lib_release", "Lru/ozon/app/android/pikazon/image/ImageSize;", "size", "Lru/ozon/app/android/pikazon/image/ImageSize;", "getSize", "()Lru/ozon/app/android/pikazon/image/ImageSize;", "Lru/ozon/app/android/pikazon/request/target/PikazonTarget;", "target", "Lru/ozon/app/android/pikazon/request/target/PikazonTarget;", "getTarget", "()Lru/ozon/app/android/pikazon/request/target/PikazonTarget;", "Lcom/bumptech/glide/n;", "requestManager", "Lcom/bumptech/glide/n;", "getRequestManager$lib_release", "()Lcom/bumptech/glide/n;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PikazonRequest<Resource> {

    @NotNull
    private final PikazonRequestBuilder<Resource> builder;
    private final boolean isNetworkUrl;

    @NotNull
    private final n requestManager;

    @NotNull
    private final Class<Resource> resourceType;
    private final ImageSize size;

    @NotNull
    private final Object source;
    private final PikazonTarget<Resource> target;

    @NotNull
    private final String uuid;

    public PikazonRequest(@NotNull String uuid, @NotNull Object source, @NotNull Class<Resource> resourceType, boolean z11, @NotNull PikazonRequestBuilder<Resource> builder) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(resourceType, "resourceType");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.uuid = uuid;
        this.source = source;
        this.resourceType = resourceType;
        this.isNetworkUrl = z11;
        this.builder = builder;
        this.size = builder.getSize();
        this.target = builder.getTarget$lib_release();
        n n11 = c.n(builder.getContext());
        Intrinsics.checkNotNullExpressionValue(n11, "with(...)");
        this.requestManager = n11;
    }

    public final void cancel() {
        PikazonTarget<Resource> pikazonTarget = this.target;
        if (pikazonTarget != null) {
            pikazonTarget.clear(this);
        }
    }

    @NotNull
    public final PikazonRequestBuilder<Resource> getBuilder$lib_release() {
        return this.builder;
    }

    @NotNull
    /* renamed from: getRequestManager$lib_release, reason: from getter */
    public final n getRequestManager() {
        return this.requestManager;
    }

    @NotNull
    public final Class<Resource> getResourceType$lib_release() {
        return this.resourceType;
    }

    public final ImageSize getSize() {
        return this.size;
    }

    @NotNull
    public final Object getSource() {
        return this.source;
    }

    public final PikazonTarget<Resource> getTarget() {
        return this.target;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public final void load() {
        PikazonTarget<Resource> pikazonTarget = this.target;
        if (pikazonTarget == null) {
            throw new IllegalArgumentException("target == null");
        }
        pikazonTarget.load(this, this.builder.getCallback$lib_release());
    }

    @NotNull
    public final PikazonRequestBuilder<Resource> newBuilder() {
        return new PikazonRequestBuilder<>(this);
    }
}
