package com.vk.media.ok;

import com.vk.media.ok.b;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* compiled from: IClipsGalleryPicker.kt */
/* loaded from: classes3.dex */
public interface IClipsGalleryPicker {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IClipsGalleryPicker.kt */
    public static final class MediaType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MediaType[] $VALUES;
        public static final MediaType PHOTO;
        public static final MediaType PHOTO_AND_VIDEO;
        public static final MediaType VIDEO;

        static {
            MediaType mediaType = new MediaType("PHOTO", 0);
            PHOTO = mediaType;
            MediaType mediaType2 = new MediaType(SignalingProtocol.MEDIA_OPTION_VIDEO, 1);
            VIDEO = mediaType2;
            MediaType mediaType3 = new MediaType("PHOTO_AND_VIDEO", 2);
            PHOTO_AND_VIDEO = mediaType3;
            MediaType[] mediaTypeArr = {mediaType, mediaType2, mediaType3};
            $VALUES = mediaTypeArr;
            $ENTRIES = new asp(mediaTypeArr);
        }

        public MediaType() {
            throw null;
        }

        public static MediaType valueOf(String str) {
            return (MediaType) Enum.valueOf(MediaType.class, str);
        }

        public static MediaType[] values() {
            return (MediaType[]) $VALUES.clone();
        }
    }

    void a(b.f fVar);

    void b(MediaType mediaType);
}
