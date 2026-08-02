package com.unity3d.services.core.network.domain;

import defpackage.ot8;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public /* synthetic */ class CleanupDirectory$invoke$cachedFiles$1 extends ot8 implements Function1<File, Boolean> {
    public static final CleanupDirectory$invoke$cachedFiles$1 INSTANCE = new CleanupDirectory$invoke$cachedFiles$1();

    public CleanupDirectory$invoke$cachedFiles$1() {
        super(1, File.class, "isFile", "isFile()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(File file) {
        file.getClass();
        return Boolean.valueOf(file.isFile());
    }
}
