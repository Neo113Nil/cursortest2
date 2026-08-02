package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public final class AvoidanceFlags implements Serializable {
    private boolean avoidBoatFerry;
    private boolean avoidFordCrossing;
    private boolean avoidHighway;
    private boolean avoidPoorCondition;
    private boolean avoidRailwayCrossing;
    private boolean avoidTolls;
    private boolean avoidTunnel;
    private boolean avoidUnpaved;

    public AvoidanceFlags(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.avoidTolls = z11;
        this.avoidUnpaved = z12;
        this.avoidPoorCondition = z13;
        this.avoidRailwayCrossing = z14;
        this.avoidBoatFerry = z15;
        this.avoidFordCrossing = z16;
        this.avoidTunnel = z17;
        this.avoidHighway = z18;
    }

    public boolean getAvoidBoatFerry() {
        return this.avoidBoatFerry;
    }

    public boolean getAvoidFordCrossing() {
        return this.avoidFordCrossing;
    }

    public boolean getAvoidHighway() {
        return this.avoidHighway;
    }

    public boolean getAvoidPoorCondition() {
        return this.avoidPoorCondition;
    }

    public boolean getAvoidRailwayCrossing() {
        return this.avoidRailwayCrossing;
    }

    public boolean getAvoidTolls() {
        return this.avoidTolls;
    }

    public boolean getAvoidTunnel() {
        return this.avoidTunnel;
    }

    public boolean getAvoidUnpaved() {
        return this.avoidUnpaved;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.avoidTolls = archive.add(this.avoidTolls);
        this.avoidUnpaved = archive.add(this.avoidUnpaved);
        this.avoidPoorCondition = archive.add(this.avoidPoorCondition);
        this.avoidRailwayCrossing = archive.add(this.avoidRailwayCrossing);
        this.avoidBoatFerry = archive.add(this.avoidBoatFerry);
        this.avoidFordCrossing = archive.add(this.avoidFordCrossing);
        this.avoidTunnel = archive.add(this.avoidTunnel);
        this.avoidHighway = archive.add(this.avoidHighway);
    }

    public AvoidanceFlags setAvoidBoatFerry(boolean z11) {
        this.avoidBoatFerry = z11;
        return this;
    }

    public AvoidanceFlags setAvoidFordCrossing(boolean z11) {
        this.avoidFordCrossing = z11;
        return this;
    }

    public AvoidanceFlags setAvoidHighway(boolean z11) {
        this.avoidHighway = z11;
        return this;
    }

    public AvoidanceFlags setAvoidPoorCondition(boolean z11) {
        this.avoidPoorCondition = z11;
        return this;
    }

    public AvoidanceFlags setAvoidRailwayCrossing(boolean z11) {
        this.avoidRailwayCrossing = z11;
        return this;
    }

    public AvoidanceFlags setAvoidTolls(boolean z11) {
        this.avoidTolls = z11;
        return this;
    }

    public AvoidanceFlags setAvoidTunnel(boolean z11) {
        this.avoidTunnel = z11;
        return this;
    }

    public AvoidanceFlags setAvoidUnpaved(boolean z11) {
        this.avoidUnpaved = z11;
        return this;
    }

    public AvoidanceFlags() {
        this.avoidTolls = false;
        this.avoidUnpaved = false;
        this.avoidPoorCondition = false;
        this.avoidRailwayCrossing = false;
        this.avoidBoatFerry = false;
        this.avoidFordCrossing = false;
        this.avoidTunnel = false;
        this.avoidHighway = false;
    }
}
