package com.facebook.soloader;

import android.content.Context;
import xsna.t33;

@DoNotStripAny
/* loaded from: classes12.dex */
public class SoLoaderDSONotFoundError extends SoLoaderULError {
    public SoLoaderDSONotFoundError(String str) {
        super(str);
    }

    public static SoLoaderDSONotFoundError create(String str, Context context, SoSource[] soSourceArr) {
        StringBuilder a = t33.a("couldn't find DSO to load: ", str, "\n\texisting SO sources: ");
        for (int i = 0; i < soSourceArr.length; i++) {
            a.append("\n\t\tSoSource ");
            a.append(i);
            a.append(": ");
            a.append(soSourceArr[i].toString());
        }
        if (context != null) {
            a.append("\n\tNative lib dir: ");
            a.append(context.getApplicationInfo().nativeLibraryDir);
            a.append("\n");
        }
        return new SoLoaderDSONotFoundError(str, a.toString());
    }

    public SoLoaderDSONotFoundError(String str, String str2) {
        super(str, str2);
    }
}
