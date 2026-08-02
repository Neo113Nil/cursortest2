package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.rP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3263rP<ModelType, StateType> {
    public final ModelType A03;
    public final StateType A04;
    public final String A05;
    public final String A06;
    public List<ViewpointAction<ModelType, StateType>> A01 = null;
    public C3261rN A00 = C3261rN.A0B;
    public boolean A02 = false;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rP != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public C3263rP(ModelType model, StateType state, String str) {
        this.A03 = model;
        this.A04 = state;
        this.A06 = str;
        this.A05 = str;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rP != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rS != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final C3263rP<ModelType, StateType> A06(ViewpointAction<ModelType, StateType> viewpointAction) {
        if (this.A01 == null) {
            this.A01 = new ArrayList();
        }
        this.A01.add(viewpointAction);
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rP != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public final C3261rN<ModelType, StateType> A07() {
        return new C3261rN<>(this);
    }
}
