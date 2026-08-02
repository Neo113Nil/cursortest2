package io.intercom.android.sdk.ui.component;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MediaPickerButton.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lio/intercom/android/sdk/ui/component/MediaType;", "", "<init>", "(Ljava/lang/String;I)V", "ImageOnly", "VideOnly", "DocumentOnly", "ImageAndVideo", "All", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MediaType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MediaType[] $VALUES;
    public static final MediaType ImageOnly = new MediaType("ImageOnly", 0);
    public static final MediaType VideOnly = new MediaType("VideOnly", 1);
    public static final MediaType DocumentOnly = new MediaType("DocumentOnly", 2);
    public static final MediaType ImageAndVideo = new MediaType("ImageAndVideo", 3);
    public static final MediaType All = new MediaType("All", 4);

    private static final /* synthetic */ MediaType[] $values() {
        return new MediaType[]{ImageOnly, VideOnly, DocumentOnly, ImageAndVideo, All};
    }

    public static EnumEntries<MediaType> getEntries() {
        return $ENTRIES;
    }

    private MediaType(String str, int i) {
    }

    static {
        MediaType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static MediaType valueOf(String str) {
        return (MediaType) Enum.valueOf(MediaType.class, str);
    }

    public static MediaType[] values() {
        return (MediaType[]) $VALUES.clone();
    }
}
