package com.unity3d.ads.core.extensions;

import java.io.File;
import java.util.LinkedList;
import xsna.wk3;

/* compiled from: FileExtensions.kt */
/* loaded from: classes14.dex */
public final class FileExtensionsKt {
    public static final long getDirectorySize(File file) {
        File[] listFiles;
        long j = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(file);
        while (!linkedList.isEmpty()) {
            File file2 = (File) linkedList.remove(0);
            if (file2.exists() && (listFiles = file2.listFiles()) != null && listFiles.length != 0) {
                wk3 wk3Var = new wk3(listFiles);
                while (wk3Var.hasNext()) {
                    File file3 = (File) wk3Var.next();
                    if (file3.isDirectory()) {
                        linkedList.add(file3);
                    } else {
                        j += file3.length();
                    }
                }
            }
        }
        return j;
    }
}
