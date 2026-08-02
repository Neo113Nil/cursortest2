package com.sofascore.model;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public class Section {
    private final String name;
    private final int position;

    public Section(String str, int i) {
        this.name = str;
        this.position = i;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

    public Section(String str) {
        this(str, 0);
    }
}
