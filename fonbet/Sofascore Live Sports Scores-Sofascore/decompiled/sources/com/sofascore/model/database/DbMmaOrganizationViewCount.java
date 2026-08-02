package com.sofascore.model.database;

import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\n\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/sofascore/model/database/DbMmaOrganizationViewCount;", "", "id", "", "viewCount", "ignored", "", "<init>", "(IIZ)V", "getId", "()I", "getViewCount", "setViewCount", "(I)V", "getIgnored", "()Z", "setIgnored", "(Z)V", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DbMmaOrganizationViewCount {
    private final int id;
    private boolean ignored;
    private int viewCount;

    public DbMmaOrganizationViewCount(int i, int i2, boolean z) {
        this.id = i;
        this.viewCount = i2;
        this.ignored = z;
    }

    public final int getId() {
        return this.id;
    }

    public final boolean getIgnored() {
        return this.ignored;
    }

    public final int getViewCount() {
        return this.viewCount;
    }

    public final void setIgnored(boolean z) {
        this.ignored = z;
    }

    public final void setViewCount(int i) {
        this.viewCount = i;
    }
}
