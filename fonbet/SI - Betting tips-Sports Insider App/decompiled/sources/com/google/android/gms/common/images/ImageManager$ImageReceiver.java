package com.google.android.gms.common.images;

import android.content.res.AssetFileDescriptor;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import com.google.android.gms.common.annotation.KeepName;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@KeepName
/* loaded from: classes.dex */
final class ImageManager$ImageReceiver extends ResultReceiver {
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i5, Bundle bundle) {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
        if (parcelFileDescriptor != null) {
            new AssetFileDescriptor(parcelFileDescriptor, bundle.getLong("assetFdStartOffset", 0L), bundle.getLong("assetFdLength", -1L));
        }
        throw null;
    }
}
