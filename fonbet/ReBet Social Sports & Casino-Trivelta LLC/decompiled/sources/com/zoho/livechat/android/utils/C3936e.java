package com.zoho.livechat.android.utils;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* renamed from: com.zoho.livechat.android.utils.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3936e extends LinkedBlockingDeque {
    private static final long serialVersionUID = -4854985351588039351L;

    @Override // java.util.concurrent.LinkedBlockingDeque, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue, java.util.Deque
    public boolean add(Object obj) {
        return super.offerFirst(obj);
    }

    @Override // java.util.concurrent.LinkedBlockingDeque, java.util.Queue, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue, java.util.Deque
    public boolean offer(Object obj) {
        return super.offerFirst(obj);
    }

    @Override // java.util.concurrent.LinkedBlockingDeque, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public void put(Object obj) {
        super.putFirst(obj);
    }

    @Override // java.util.concurrent.LinkedBlockingDeque, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public boolean offer(Object obj, long j10, TimeUnit timeUnit) {
        return super.offerFirst(obj, j10, timeUnit);
    }
}
