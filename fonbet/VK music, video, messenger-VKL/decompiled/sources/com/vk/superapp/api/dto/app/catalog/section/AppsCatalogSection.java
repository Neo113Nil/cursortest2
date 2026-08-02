package com.vk.superapp.api.dto.app.catalog.section;

import android.os.Parcelable;
import com.vk.superapp.api.dto.app.catalog.SectionHeader;
import com.vk.superapp.api.dto.app.catalog.footer.SectionFooter;

/* compiled from: AppsCatalogSection.kt */
/* loaded from: classes6.dex */
public abstract class AppsCatalogSection implements Parcelable {
    public final String b;
    public final int c;
    public final String d;
    public final SectionHeader e;
    public final SectionFooter f;

    public AppsCatalogSection(String str, int i, String str2, SectionHeader sectionHeader, SectionFooter sectionFooter) {
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = sectionHeader;
        this.f = sectionFooter;
    }

    public SectionFooter d() {
        return this.f;
    }

    public SectionHeader e() {
        return this.e;
    }

    public String f() {
        return null;
    }

    public int getId() {
        return this.c;
    }

    public String r() {
        return this.d;
    }
}
