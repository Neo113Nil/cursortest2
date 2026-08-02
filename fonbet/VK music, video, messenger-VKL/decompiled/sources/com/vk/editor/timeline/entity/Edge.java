package com.vk.editor.timeline.entity;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Edge.kt */
/* loaded from: classes18.dex */
public final class Edge {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Edge[] $VALUES;
    public static final Edge Left;
    public static final Edge None;
    public static final Edge Right;

    static {
        Edge edge = new Edge("None", 0);
        None = edge;
        Edge edge2 = new Edge("Left", 1);
        Left = edge2;
        Edge edge3 = new Edge("Right", 2);
        Right = edge3;
        Edge[] edgeArr = {edge, edge2, edge3};
        $VALUES = edgeArr;
        $ENTRIES = new asp(edgeArr);
    }

    public Edge() {
        throw null;
    }

    public static Edge valueOf(String str) {
        return (Edge) Enum.valueOf(Edge.class, str);
    }

    public static Edge[] values() {
        return (Edge[]) $VALUES.clone();
    }
}
