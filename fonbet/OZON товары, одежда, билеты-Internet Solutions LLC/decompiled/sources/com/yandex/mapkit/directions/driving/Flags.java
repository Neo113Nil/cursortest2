package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class Flags implements Serializable {
    private boolean blocked;
    private boolean builtOffline;
    private boolean deadJam;
    private boolean forParking;
    private boolean futureBlocked;
    private boolean hasCheckpoints;
    private boolean hasFerries;
    private boolean hasFordCrossing;
    private boolean hasHighways;
    private boolean hasInPoorConditionRoads;
    private boolean hasNonTransactionalTolls;
    private boolean hasRailwayCrossing;
    private boolean hasRuggedRoads;
    private boolean hasTolls;
    private boolean hasTunnels;
    private boolean hasUnpavedRoads;
    private boolean hasVehicleRestrictions;
    private boolean predicted;
    private boolean requiresAccessPass;
    private boolean scheduledDeparture;

    public Flags(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z31, boolean z32) {
        this.blocked = z11;
        this.hasFerries = z12;
        this.hasTolls = z13;
        this.requiresAccessPass = z14;
        this.forParking = z15;
        this.futureBlocked = z16;
        this.deadJam = z17;
        this.builtOffline = z18;
        this.predicted = z19;
        this.hasRuggedRoads = z21;
        this.hasFordCrossing = z22;
        this.hasVehicleRestrictions = z23;
        this.hasUnpavedRoads = z24;
        this.hasInPoorConditionRoads = z25;
        this.hasRailwayCrossing = z26;
        this.hasCheckpoints = z27;
        this.scheduledDeparture = z28;
        this.hasNonTransactionalTolls = z29;
        this.hasTunnels = z31;
        this.hasHighways = z32;
    }

    public boolean getBlocked() {
        return this.blocked;
    }

    public boolean getBuiltOffline() {
        return this.builtOffline;
    }

    public boolean getDeadJam() {
        return this.deadJam;
    }

    public boolean getForParking() {
        return this.forParking;
    }

    public boolean getFutureBlocked() {
        return this.futureBlocked;
    }

    public boolean getHasCheckpoints() {
        return this.hasCheckpoints;
    }

    public boolean getHasFerries() {
        return this.hasFerries;
    }

    public boolean getHasFordCrossing() {
        return this.hasFordCrossing;
    }

    public boolean getHasHighways() {
        return this.hasHighways;
    }

    public boolean getHasInPoorConditionRoads() {
        return this.hasInPoorConditionRoads;
    }

    public boolean getHasNonTransactionalTolls() {
        return this.hasNonTransactionalTolls;
    }

    public boolean getHasRailwayCrossing() {
        return this.hasRailwayCrossing;
    }

    public boolean getHasRuggedRoads() {
        return this.hasRuggedRoads;
    }

    public boolean getHasTolls() {
        return this.hasTolls;
    }

    public boolean getHasTunnels() {
        return this.hasTunnels;
    }

    public boolean getHasUnpavedRoads() {
        return this.hasUnpavedRoads;
    }

    public boolean getHasVehicleRestrictions() {
        return this.hasVehicleRestrictions;
    }

    public boolean getPredicted() {
        return this.predicted;
    }

    public boolean getRequiresAccessPass() {
        return this.requiresAccessPass;
    }

    public boolean getScheduledDeparture() {
        return this.scheduledDeparture;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.blocked = archive.add(this.blocked);
        this.hasFerries = archive.add(this.hasFerries);
        this.hasTolls = archive.add(this.hasTolls);
        this.requiresAccessPass = archive.add(this.requiresAccessPass);
        this.forParking = archive.add(this.forParking);
        this.futureBlocked = archive.add(this.futureBlocked);
        this.deadJam = archive.add(this.deadJam);
        this.builtOffline = archive.add(this.builtOffline);
        this.predicted = archive.add(this.predicted);
        this.hasRuggedRoads = archive.add(this.hasRuggedRoads);
        this.hasFordCrossing = archive.add(this.hasFordCrossing);
        this.hasVehicleRestrictions = archive.add(this.hasVehicleRestrictions);
        this.hasUnpavedRoads = archive.add(this.hasUnpavedRoads);
        this.hasInPoorConditionRoads = archive.add(this.hasInPoorConditionRoads);
        this.hasRailwayCrossing = archive.add(this.hasRailwayCrossing);
        this.hasCheckpoints = archive.add(this.hasCheckpoints);
        this.scheduledDeparture = archive.add(this.scheduledDeparture);
        this.hasNonTransactionalTolls = archive.add(this.hasNonTransactionalTolls);
        this.hasTunnels = archive.add(this.hasTunnels);
        this.hasHighways = archive.add(this.hasHighways);
    }

    public Flags() {
    }
}
