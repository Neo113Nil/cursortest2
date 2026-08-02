package com.mbridge.msdk.config.component.animation;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class g {
    private boolean c;
    private int a = 1;
    private String b = "";
    private List<e> d = new ArrayList();

    public void a(List<e> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.d = list;
    }

    public List<e> b() {
        return this.d;
    }

    public void a(String str) {
        if (str == null) {
            str = "";
        }
        this.b = str;
    }

    public void a(boolean z) {
        this.c = z;
    }

    public String a() {
        return this.b;
    }
}
