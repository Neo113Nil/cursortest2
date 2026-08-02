package ru.ozon.android.hardwareinfo;

import java.io.File;
import java.io.FileFilter;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        boolean cpuFiles$lambda$3;
        cpuFiles$lambda$3 = DeviceInfoManagerImpl.getCpuFiles$lambda$3(file);
        return cpuFiles$lambda$3;
    }
}
