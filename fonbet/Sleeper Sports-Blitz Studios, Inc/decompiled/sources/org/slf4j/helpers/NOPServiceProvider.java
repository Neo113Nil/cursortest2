package org.slf4j.helpers;

import org.slf4j.ILoggerFactory;
import org.slf4j.IMarkerFactory;
import org.slf4j.spi.MDCAdapter;
import org.slf4j.spi.SLF4JServiceProvider;

/* loaded from: classes11.dex */
public class NOPServiceProvider implements SLF4JServiceProvider {
    public static String REQUESTED_API_VERSION = "1.8.99";
    private ILoggerFactory loggerFactory = new NOPLoggerFactory();
    private IMarkerFactory markerFactory = new BasicMarkerFactory();
    private MDCAdapter mdcAdapter = new NOPMDCAdapter();

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public void initialize() {
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public ILoggerFactory getLoggerFactory() {
        return this.loggerFactory;
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public IMarkerFactory getMarkerFactory() {
        return this.markerFactory;
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public MDCAdapter getMDCAdapter() {
        return this.mdcAdapter;
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public String getRequesteApiVersion() {
        return REQUESTED_API_VERSION;
    }
}
