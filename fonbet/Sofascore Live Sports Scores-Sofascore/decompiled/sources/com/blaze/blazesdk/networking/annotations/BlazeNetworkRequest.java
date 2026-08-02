package com.blaze.blazesdk.networking.annotations;

import androidx.annotation.Keep;
import defpackage.gz8;
import defpackage.jp5;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Target({ElementType.METHOD})
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\fB<\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\tR\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\nR\u000f\u0010\u0004\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0004\u0010\nR\u000f\u0010\u0005\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0005\u0010\nR\u000f\u0010\u0006\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0006\u0010\nR\u000f\u0010\u0007\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0007\u0010\nR\u000f\u0010\b\u001a\u00020\t¢\u0006\u0006\u001a\u0004\b\b\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/blaze/blazesdk/networking/annotations/BlazeNetworkRequest;", "", "includeApiKey", "", "includeClientPlatform", "includeExperiments", "includePreferredLanguage", "includeGeo", "contentType", "Lcom/blaze/blazesdk/networking/annotations/BlazeNetworkRequest$ContentTypeValues;", "()Z", "()Lcom/blaze/blazesdk/networking/annotations/BlazeNetworkRequest$ContentTypeValues;", "ContentTypeValues", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface BlazeNetworkRequest {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/blaze/blazesdk/networking/annotations/BlazeNetworkRequest$ContentTypeValues;", "", "rawVal", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawVal", "()Ljava/lang/String;", "NONE", "VIDEO", "MOMENT", "STORY", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ContentTypeValues {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ ContentTypeValues[] $VALUES;

        @Nullable
        private final String rawVal;
        public static final ContentTypeValues NONE = new ContentTypeValues("NONE", 0, null);
        public static final ContentTypeValues VIDEO = new ContentTypeValues("VIDEO", 1, "Video");
        public static final ContentTypeValues MOMENT = new ContentTypeValues("MOMENT", 2, "Moment");
        public static final ContentTypeValues STORY = new ContentTypeValues("STORY", 3, "Story");

        private static final /* synthetic */ ContentTypeValues[] $values() {
            return new ContentTypeValues[]{NONE, VIDEO, MOMENT, STORY};
        }

        static {
            ContentTypeValues[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private ContentTypeValues(String str, int i, String str2) {
            this.rawVal = str2;
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static ContentTypeValues valueOf(String str) {
            return (ContentTypeValues) Enum.valueOf(ContentTypeValues.class, str);
        }

        public static ContentTypeValues[] values() {
            return (ContentTypeValues[]) $VALUES.clone();
        }

        @Nullable
        public final String getRawVal() {
            return this.rawVal;
        }
    }

    ContentTypeValues contentType() default ContentTypeValues.NONE;

    boolean includeApiKey() default false;

    boolean includeClientPlatform() default false;

    boolean includeExperiments() default false;

    boolean includeGeo() default false;

    boolean includePreferredLanguage() default false;
}
