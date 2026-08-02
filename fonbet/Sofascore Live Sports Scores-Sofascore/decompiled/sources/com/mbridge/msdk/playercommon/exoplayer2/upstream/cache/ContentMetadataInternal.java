package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import android.net.Uri;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
final class ContentMetadataInternal {
    private static final String METADATA_NAME_CONTENT_LENGTH = "exo_len";
    private static final String METADATA_NAME_REDIRECTED_URI = "exo_redir";
    private static final String PREFIX = "exo_";

    private ContentMetadataInternal() {
    }

    public static long getContentLength(ContentMetadata contentMetadata) {
        return contentMetadata.get(METADATA_NAME_CONTENT_LENGTH, -1L);
    }

    @Nullable
    public static Uri getRedirectedUri(ContentMetadata contentMetadata) {
        String str = contentMetadata.get(METADATA_NAME_REDIRECTED_URI, (String) null);
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    public static void removeContentLength(ContentMetadataMutations contentMetadataMutations) {
        contentMetadataMutations.remove(METADATA_NAME_CONTENT_LENGTH);
    }

    public static void removeRedirectedUri(ContentMetadataMutations contentMetadataMutations) {
        contentMetadataMutations.remove(METADATA_NAME_REDIRECTED_URI);
    }

    public static void setContentLength(ContentMetadataMutations contentMetadataMutations, long j) {
        contentMetadataMutations.set(METADATA_NAME_CONTENT_LENGTH, j);
    }

    public static void setRedirectedUri(ContentMetadataMutations contentMetadataMutations, Uri uri) {
        contentMetadataMutations.set(METADATA_NAME_REDIRECTED_URI, uri.toString());
    }
}
