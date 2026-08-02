package com.inmobi.media;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Ob {
    public static final Nb a(String str) {
        str.getClass();
        return kotlin.text.c.o(str, "DEBUG", true) ? Nb.DEBUG : kotlin.text.c.o(str, "ERROR", true) ? Nb.ERROR : kotlin.text.c.o(str, "INFO", true) ? Nb.INFO : kotlin.text.c.o(str, "STATE", true) ? Nb.STATE : Nb.ERROR;
    }
}
