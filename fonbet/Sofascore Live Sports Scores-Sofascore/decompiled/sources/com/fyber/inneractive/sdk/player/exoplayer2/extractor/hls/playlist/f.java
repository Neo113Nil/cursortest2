package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f {
    public final BufferedReader a;
    public final Queue b;
    public String c;

    public f(LinkedList linkedList, BufferedReader bufferedReader) {
        this.b = linkedList;
        this.a = bufferedReader;
    }

    public final boolean a() {
        String trim;
        if (this.c != null) {
            return true;
        }
        if (!this.b.isEmpty()) {
            this.c = (String) this.b.poll();
            return true;
        }
        do {
            String readLine = this.a.readLine();
            this.c = readLine;
            if (readLine == null) {
                return false;
            }
            trim = readLine.trim();
            this.c = trim;
        } while (trim.isEmpty());
        return true;
    }
}
