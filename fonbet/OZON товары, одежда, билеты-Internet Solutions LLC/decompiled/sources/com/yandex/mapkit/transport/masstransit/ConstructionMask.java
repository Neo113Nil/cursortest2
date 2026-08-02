package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class ConstructionMask implements Serializable {
    private boolean binding;
    private boolean crosswalk;
    private Elevator elevator;
    private Escalator escalator;
    private boolean indoor;
    private Pass pass;
    private Stairs stairs;
    private boolean transition;
    private Travolator travolator;
    private boolean tunnel;

    public ConstructionMask(Stairs stairs, Pass pass, boolean z11, boolean z12, boolean z13, boolean z14, Travolator travolator, boolean z15, Escalator escalator, Elevator elevator) {
        this.stairs = stairs;
        this.pass = pass;
        this.crosswalk = z11;
        this.binding = z12;
        this.transition = z13;
        this.tunnel = z14;
        this.travolator = travolator;
        this.indoor = z15;
        this.escalator = escalator;
        this.elevator = elevator;
    }

    public boolean getBinding() {
        return this.binding;
    }

    public boolean getCrosswalk() {
        return this.crosswalk;
    }

    public Elevator getElevator() {
        return this.elevator;
    }

    public Escalator getEscalator() {
        return this.escalator;
    }

    public boolean getIndoor() {
        return this.indoor;
    }

    public Pass getPass() {
        return this.pass;
    }

    public Stairs getStairs() {
        return this.stairs;
    }

    public boolean getTransition() {
        return this.transition;
    }

    public Travolator getTravolator() {
        return this.travolator;
    }

    public boolean getTunnel() {
        return this.tunnel;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.stairs = (Stairs) archive.add((Archive) this.stairs, true, (Class<Archive>) Stairs.class);
        this.pass = (Pass) archive.add((Archive) this.pass, true, (Class<Archive>) Pass.class);
        this.crosswalk = archive.add(this.crosswalk);
        this.binding = archive.add(this.binding);
        this.transition = archive.add(this.transition);
        this.tunnel = archive.add(this.tunnel);
        this.travolator = (Travolator) archive.add((Archive) this.travolator, true, (Class<Archive>) Travolator.class);
        this.indoor = archive.add(this.indoor);
        this.escalator = (Escalator) archive.add((Archive) this.escalator, true, (Class<Archive>) Escalator.class);
        this.elevator = (Elevator) archive.add((Archive) this.elevator, true, (Class<Archive>) Elevator.class);
    }

    public ConstructionMask() {
    }
}
