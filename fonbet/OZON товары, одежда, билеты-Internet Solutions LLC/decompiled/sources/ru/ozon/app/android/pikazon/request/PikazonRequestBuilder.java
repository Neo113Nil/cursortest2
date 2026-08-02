package ru.ozon.app.android.pikazon.request;

import P4.f;
import android.content.Context;
import android.webkit.URLUtil;
import c6.n;
import com.bumptech.glide.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.glide.loaders.PikazonUrl;
import ru.ozon.app.android.pikazon.glide.request.ImageLoaderKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.processors.InscribedUrlProcessor;
import ru.ozon.app.android.pikazon.request.target.ContextTarget;
import ru.ozon.app.android.pikazon.request.target.PikazonTarget;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001oB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0016\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u001e\u0010\u001dJ\u001b\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u001f\u0010 J!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000!¢\u0006\u0004\b\u001f\u0010\"J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b%\u0010&J\u0013\u0010'\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010&J\u0013\u0010(\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010&J\u0013\u0010*\u001a\u00020)*\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00103R*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010?\u001a\u00020>8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010F\u001a\u00020E8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Q\u001a\u00020)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010X\u001a\u00020W8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR$\u0010d\u001a\u0004\u0018\u00010c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR \u0010k\u001a\b\u0012\u0004\u0012\u00020\u00180j8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n¨\u0006p"}, d2 = {"Lru/ozon/app/android/pikazon/request/PikazonRequestBuilder;", "Resource", "", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "resourceType", "<init>", "(Landroid/content/Context;Ljava/lang/Class;)V", "Lru/ozon/app/android/pikazon/request/PikazonRequest;", "request", "(Lru/ozon/app/android/pikazon/request/PikazonRequest;)V", "source", "(Ljava/lang/Object;)Lru/ozon/app/android/pikazon/request/PikazonRequestBuilder;", "Lru/ozon/app/android/pikazon/image/ImageSize;", "size", "(Lru/ozon/app/android/pikazon/image/ImageSize;)Lru/ozon/app/android/pikazon/request/PikazonRequestBuilder;", "", "placeholderRes", HammersV3BodyDTO.PLACEHOLDER, "(I)Lru/ozon/app/android/pikazon/request/PikazonRequestBuilder;", "Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;", "callback", "(Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;)Lru/ozon/app/android/pikazon/request/PikazonRequestBuilder;", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation;", "transformation", "addTransformation", "(Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation;)Lru/ozon/app/android/pikazon/request/PikazonRequestBuilder;", "optionalCenterCrop", "()Lru/ozon/app/android/pikazon/request/PikazonRequestBuilder;", "optionalCenterInside", "target", "(Landroid/content/Context;)Lru/ozon/app/android/pikazon/request/PikazonRequestBuilder;", "Lru/ozon/app/android/pikazon/request/target/PikazonTarget;", "(Lru/ozon/app/android/pikazon/request/target/PikazonTarget;)Lru/ozon/app/android/pikazon/request/PikazonRequestBuilder;", "build", "()Lru/ozon/app/android/pikazon/request/PikazonRequest;", "transformIntoPikazonUrl", "(Ljava/lang/Object;)Ljava/lang/Object;", "transformWithSourceTransformation", "transformWithInscribedProcessor", "", "isNetworkUrl", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "getContext$lib_release", "()Landroid/content/Context;", "Ljava/lang/Class;", "", "uuid", "Ljava/lang/String;", "Ljava/lang/Object;", "Lru/ozon/app/android/pikazon/request/target/PikazonTarget;", "getTarget$lib_release", "()Lru/ozon/app/android/pikazon/request/target/PikazonTarget;", "setTarget$lib_release", "(Lru/ozon/app/android/pikazon/request/target/PikazonTarget;)V", "Lru/ozon/app/android/pikazon/image/ImageSize;", "getSize$lib_release", "()Lru/ozon/app/android/pikazon/image/ImageSize;", "setSize$lib_release", "(Lru/ozon/app/android/pikazon/image/ImageSize;)V", "Lc6/n;", "downsampleStrategy", "Lc6/n;", "getDownsampleStrategy$lib_release", "()Lc6/n;", "setDownsampleStrategy$lib_release", "(Lc6/n;)V", "Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;", "priority", "Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;", "getPriority$lib_release", "()Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;", "setPriority$lib_release", "(Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;)V", "Ljava/lang/Integer;", "getPlaceholderRes$lib_release", "()Ljava/lang/Integer;", "setPlaceholderRes$lib_release", "(Ljava/lang/Integer;)V", "useCrossfade", "Z", "getUseCrossfade$lib_release", "()Z", "setUseCrossfade$lib_release", "(Z)V", "Lru/ozon/app/android/pikazon/processors/InscribedUrlProcessor;", "inscribedProcessor", "Lru/ozon/app/android/pikazon/processors/InscribedUrlProcessor;", "getInscribedProcessor$lib_release", "()Lru/ozon/app/android/pikazon/processors/InscribedUrlProcessor;", "setInscribedProcessor$lib_release", "(Lru/ozon/app/android/pikazon/processors/InscribedUrlProcessor;)V", "Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;", "getCallback$lib_release", "()Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;", "setCallback$lib_release", "(Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;)V", "Lru/ozon/app/android/pikazon/request/PikazonRequestBuilder$OptionalTransform;", "optionalTransform", "Lru/ozon/app/android/pikazon/request/PikazonRequestBuilder$OptionalTransform;", "getOptionalTransform$lib_release", "()Lru/ozon/app/android/pikazon/request/PikazonRequestBuilder$OptionalTransform;", "setOptionalTransform$lib_release", "(Lru/ozon/app/android/pikazon/request/PikazonRequestBuilder$OptionalTransform;)V", "", "transformations", "Ljava/util/List;", "getTransformations$lib_release", "()Ljava/util/List;", "OptionalTransform", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PikazonRequestBuilder<Resource> {
    private PikazonLoaderCallback<Resource> callback;

    @NotNull
    private final Context context;

    @NotNull
    private n downsampleStrategy;

    @NotNull
    private InscribedUrlProcessor inscribedProcessor;
    private OptionalTransform optionalTransform;
    private Integer placeholderRes;

    @NotNull
    private LoadPriority priority;

    @NotNull
    private final Class<Resource> resourceType;
    private ImageSize size;
    private Object source;
    private PikazonTarget<Resource> target;

    @NotNull
    private final List<ImageTransformation> transformations;
    private boolean useCrossfade;

    @NotNull
    private String uuid;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0007\bJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/pikazon/request/PikazonRequestBuilder$OptionalTransform;", "", "Lcom/bumptech/glide/m;", "builder", "", "apply", "(Lcom/bumptech/glide/m;)V", "CenterCrop", "CenterInside", "Lru/ozon/app/android/pikazon/request/PikazonRequestBuilder$OptionalTransform$CenterCrop;", "Lru/ozon/app/android/pikazon/request/PikazonRequestBuilder$OptionalTransform$CenterInside;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OptionalTransform {

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pikazon/request/PikazonRequestBuilder$OptionalTransform$CenterCrop;", "Lru/ozon/app/android/pikazon/request/PikazonRequestBuilder$OptionalTransform;", "<init>", "()V", "Lcom/bumptech/glide/m;", "builder", "", "apply", "(Lcom/bumptech/glide/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CenterCrop implements OptionalTransform {

            @NotNull
            public static final CenterCrop INSTANCE = new CenterCrop();

            private CenterCrop() {
            }

            @Override // ru.ozon.app.android.pikazon.request.PikazonRequestBuilder.OptionalTransform
            public void apply(@NotNull m<?> builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.optionalCenterCrop();
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof CenterCrop);
            }

            public int hashCode() {
                return 1020071623;
            }

            @NotNull
            public String toString() {
                return "CenterCrop";
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pikazon/request/PikazonRequestBuilder$OptionalTransform$CenterInside;", "Lru/ozon/app/android/pikazon/request/PikazonRequestBuilder$OptionalTransform;", "<init>", "()V", "Lcom/bumptech/glide/m;", "builder", "", "apply", "(Lcom/bumptech/glide/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes13.dex */
        public static final /* data */ class CenterInside implements OptionalTransform {

            @NotNull
            public static final CenterInside INSTANCE = new CenterInside();

            private CenterInside() {
            }

            @Override // ru.ozon.app.android.pikazon.request.PikazonRequestBuilder.OptionalTransform
            public void apply(@NotNull m<?> builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.optionalCenterInside();
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof CenterInside);
            }

            public int hashCode() {
                return 1204482675;
            }

            @NotNull
            public String toString() {
                return "CenterInside";
            }
        }

        void apply(@NotNull m<?> builder);
    }

    public PikazonRequestBuilder(@NotNull Context context, @NotNull Class<Resource> resourceType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resourceType, "resourceType");
        this.context = context;
        this.resourceType = resourceType;
        this.uuid = f.b("toString(...)");
        n DEFAULT = n.f56567g;
        Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        this.downsampleStrategy = DEFAULT;
        this.priority = LoadPriority.NORMAL;
        this.inscribedProcessor = InscribedUrlProcessor.InscribedNormal.INSTANCE;
        this.transformations = new ArrayList();
    }

    private final boolean isNetworkUrl(Object obj) {
        if (obj instanceof PikazonUrl) {
            return true;
        }
        if (obj instanceof String) {
            return URLUtil.isNetworkUrl((String) obj);
        }
        return false;
    }

    private final Object transformIntoPikazonUrl(Object obj) {
        return obj instanceof PikazonUrl ? obj : ImageLoaderKt.pikazonUrlSource(obj, this.uuid);
    }

    private final Object transformWithInscribedProcessor(Object obj) {
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        String computeUrl = this.inscribedProcessor.computeUrl(str);
        return computeUrl == null ? str : computeUrl;
    }

    private final Object transformWithSourceTransformation(Object obj) {
        return ImageLoaderKt.sourceTransformation(this.context, obj);
    }

    @NotNull
    public final PikazonRequestBuilder<Resource> addTransformation(@NotNull ImageTransformation transformation) {
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        this.transformations.add(transformation);
        return this;
    }

    @NotNull
    public final PikazonRequest<Resource> build() {
        Object obj = this.source;
        if (obj == null) {
            throw new IllegalArgumentException("source == null");
        }
        Object transformIntoPikazonUrl = transformIntoPikazonUrl(transformWithSourceTransformation(transformWithInscribedProcessor(obj)));
        return new PikazonRequest<>(this.uuid, transformIntoPikazonUrl, this.resourceType, isNetworkUrl(transformIntoPikazonUrl), this);
    }

    @NotNull
    public final PikazonRequestBuilder<Resource> callback(@NotNull PikazonLoaderCallback<Resource> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
        return this;
    }

    public final PikazonLoaderCallback<Resource> getCallback$lib_release() {
        return this.callback;
    }

    @NotNull
    /* renamed from: getContext$lib_release, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    /* renamed from: getDownsampleStrategy$lib_release, reason: from getter */
    public final n getDownsampleStrategy() {
        return this.downsampleStrategy;
    }

    /* renamed from: getOptionalTransform$lib_release, reason: from getter */
    public final OptionalTransform getOptionalTransform() {
        return this.optionalTransform;
    }

    /* renamed from: getPlaceholderRes$lib_release, reason: from getter */
    public final Integer getPlaceholderRes() {
        return this.placeholderRes;
    }

    @NotNull
    /* renamed from: getPriority$lib_release, reason: from getter */
    public final LoadPriority getPriority() {
        return this.priority;
    }

    /* renamed from: getSize$lib_release, reason: from getter */
    public final ImageSize getSize() {
        return this.size;
    }

    public final PikazonTarget<Resource> getTarget$lib_release() {
        return this.target;
    }

    @NotNull
    public final List<ImageTransformation> getTransformations$lib_release() {
        return this.transformations;
    }

    /* renamed from: getUseCrossfade$lib_release, reason: from getter */
    public final boolean getUseCrossfade() {
        return this.useCrossfade;
    }

    @NotNull
    public final PikazonRequestBuilder<Resource> optionalCenterCrop() {
        this.optionalTransform = OptionalTransform.CenterCrop.INSTANCE;
        return this;
    }

    @NotNull
    public final PikazonRequestBuilder<Resource> optionalCenterInside() {
        this.optionalTransform = OptionalTransform.CenterInside.INSTANCE;
        return this;
    }

    @NotNull
    public final PikazonRequestBuilder<Resource> placeholder(int placeholderRes) {
        this.placeholderRes = Integer.valueOf(placeholderRes);
        return this;
    }

    @NotNull
    public final PikazonRequestBuilder<Resource> size(@NotNull ImageSize size) {
        Intrinsics.checkNotNullParameter(size, "size");
        this.size = size;
        return this;
    }

    @NotNull
    public final PikazonRequestBuilder<Resource> source(@NotNull Object source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        return this;
    }

    @NotNull
    public final PikazonRequestBuilder<Resource> target(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        target(new ContextTarget(context));
        return this;
    }

    @NotNull
    public final PikazonRequestBuilder<Resource> target(@NotNull PikazonTarget<Resource> target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.target = target;
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PikazonRequestBuilder(@NotNull PikazonRequest<Resource> request) {
        this(request.getBuilder$lib_release().context, request.getResourceType$lib_release());
        Intrinsics.checkNotNullParameter(request, "request");
        this.uuid = request.getUuid();
        this.source = request.getSource();
        this.target = request.getTarget();
        this.size = request.getSize();
        this.downsampleStrategy = request.getBuilder$lib_release().downsampleStrategy;
        this.priority = request.getBuilder$lib_release().priority;
        this.placeholderRes = request.getBuilder$lib_release().placeholderRes;
        this.useCrossfade = request.getBuilder$lib_release().useCrossfade;
        this.inscribedProcessor = request.getBuilder$lib_release().inscribedProcessor;
        this.callback = request.getBuilder$lib_release().callback;
        this.optionalTransform = request.getBuilder$lib_release().optionalTransform;
        this.transformations.addAll(request.getBuilder$lib_release().transformations);
    }
}
