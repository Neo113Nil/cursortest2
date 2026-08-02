package com.unity3d.services.core.network.domain;

import java.io.File;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;

/* compiled from: CleanupDirectory.kt */
/* loaded from: classes14.dex */
public /* synthetic */ class CleanupDirectory$invoke$cachedFiles$1 extends FunctionReferenceImpl implements izs<File, Boolean> {
    public static final CleanupDirectory$invoke$cachedFiles$1 INSTANCE = new CleanupDirectory$invoke$cachedFiles$1();

    public CleanupDirectory$invoke$cachedFiles$1() {
        super(1, File.class, "isFile", "isFile()Z", 0);
    }

    @Override // xsna.izs
    public final Boolean invoke(File file) {
        return Boolean.valueOf(file.isFile());
    }
}
