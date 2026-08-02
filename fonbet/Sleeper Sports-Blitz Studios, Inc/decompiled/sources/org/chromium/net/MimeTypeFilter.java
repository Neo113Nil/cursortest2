package org.chromium.net;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import java.io.File;
import java.io.FileFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes10.dex */
public class MimeTypeFilter implements FileFilter {
    private boolean mAcceptAllMimeTypes;
    private final boolean mAcceptDirectory;
    private final MimeTypeMap mMimeTypeMap;
    private final HashSet<String> mExtensions = new HashSet<>();
    private final HashSet<String> mMimeTypes = new HashSet<>();
    private final HashSet<String> mMimeSupertypes = new HashSet<>();

    public MimeTypeFilter(List<String> mimeTypes, boolean acceptDirectory) {
        Iterator<String> it = mimeTypes.iterator();
        while (it.hasNext()) {
            String lowerCase = it.next().trim().toLowerCase(Locale.US);
            if (lowerCase.startsWith(".")) {
                this.mExtensions.add(lowerCase.substring(1));
            } else if (lowerCase.equals(ApiConstant.ALL_MEDIA_TYPE)) {
                this.mAcceptAllMimeTypes = true;
            } else if (lowerCase.endsWith("/*")) {
                this.mMimeSupertypes.add(lowerCase.substring(0, lowerCase.length() - 2));
            } else if (lowerCase.contains("/")) {
                this.mMimeTypes.add(lowerCase);
            }
        }
        this.mMimeTypeMap = MimeTypeMap.getSingleton();
        this.mAcceptDirectory = acceptDirectory;
    }

    public boolean accept(Uri uri, String mimeType) {
        if (uri != null) {
            String lowerCase = MimeTypeMap.getFileExtensionFromUrl(uri.toString()).toLowerCase(Locale.US);
            if (this.mExtensions.contains(lowerCase)) {
                return true;
            }
            if (mimeType == null) {
                mimeType = getMimeTypeFromExtension(lowerCase);
            }
        }
        if (mimeType != null) {
            return this.mAcceptAllMimeTypes || this.mMimeTypes.contains(mimeType) || this.mMimeSupertypes.contains(getMimeSupertype(mimeType));
        }
        return false;
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        if (file.isDirectory()) {
            return this.mAcceptDirectory;
        }
        return accept(Uri.fromFile(file), null);
    }

    private String getMimeTypeFromExtension(String ext) {
        String mimeTypeFromExtension = this.mMimeTypeMap.getMimeTypeFromExtension(ext);
        if (mimeTypeFromExtension != null) {
            return mimeTypeFromExtension.toLowerCase(Locale.US);
        }
        return null;
    }

    private static String getMimeSupertype(String mimeType) {
        return mimeType.split("/", 2)[0];
    }
}
