package com.vk.push.core.data.repository;

/* compiled from: CrashReporterRepository.kt */
/* loaded from: classes.dex */
public interface CrashReporterRepository {
    void nonFatalReport(Throwable th, IssueKey issueKey);
}
