package ru.ozon.app.android.pikazon.processors;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.internal.StringExtKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pikazon/processors/InscribedUrlProcessor;", "", "<init>", "()V", "", ImagesContract.URL, "computeUrl", "(Ljava/lang/String;)Ljava/lang/String;", "InscribedHeight", "InscribedWidth", "InscribedNormal", "Lru/ozon/app/android/pikazon/processors/InscribedUrlProcessor$InscribedHeight;", "Lru/ozon/app/android/pikazon/processors/InscribedUrlProcessor$InscribedNormal;", "Lru/ozon/app/android/pikazon/processors/InscribedUrlProcessor$InscribedWidth;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class InscribedUrlProcessor {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pikazon/processors/InscribedUrlProcessor$InscribedHeight;", "Lru/ozon/app/android/pikazon/processors/InscribedUrlProcessor;", "<init>", "()V", "computeUrl", "", ImagesContract.URL, "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class InscribedHeight extends InscribedUrlProcessor {

        @NotNull
        public static final InscribedHeight INSTANCE = new InscribedHeight();

        private InscribedHeight() {
            super(null);
        }

        @Override // ru.ozon.app.android.pikazon.processors.InscribedUrlProcessor
        public String computeUrl(String url) {
            if (url != null) {
                return StringExtKt.setInscribedInHeight(url);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pikazon/processors/InscribedUrlProcessor$InscribedNormal;", "Lru/ozon/app/android/pikazon/processors/InscribedUrlProcessor;", "<init>", "()V", "computeUrl", "", ImagesContract.URL, "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InscribedNormal extends InscribedUrlProcessor {

        @NotNull
        public static final InscribedNormal INSTANCE = new InscribedNormal();

        private InscribedNormal() {
            super(null);
        }

        @Override // ru.ozon.app.android.pikazon.processors.InscribedUrlProcessor
        public String computeUrl(String url) {
            return url;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pikazon/processors/InscribedUrlProcessor$InscribedWidth;", "Lru/ozon/app/android/pikazon/processors/InscribedUrlProcessor;", "<init>", "()V", "computeUrl", "", ImagesContract.URL, "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class InscribedWidth extends InscribedUrlProcessor {

        @NotNull
        public static final InscribedWidth INSTANCE = new InscribedWidth();

        private InscribedWidth() {
            super(null);
        }

        @Override // ru.ozon.app.android.pikazon.processors.InscribedUrlProcessor
        public String computeUrl(String url) {
            if (url != null) {
                return StringExtKt.setInscribedInWidth(url);
            }
            return null;
        }
    }

    public /* synthetic */ InscribedUrlProcessor(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String computeUrl(String url);

    private InscribedUrlProcessor() {
    }
}
