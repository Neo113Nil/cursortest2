package org.chromium.net.impl;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.NetworkQualityThroughputListener;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes10.dex */
public class VersionSafeCallbacks {

    public static final class UrlRequestCallback extends UrlRequest.Callback {
        private final UrlRequest.Callback mWrappedCallback;

        public UrlRequestCallback(UrlRequest.Callback callback) {
            this.mWrappedCallback = callback;
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onRedirectReceived(UrlRequest request, UrlResponseInfo info, String newLocationUrl) throws Exception {
            this.mWrappedCallback.onRedirectReceived(request, info, newLocationUrl);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onResponseStarted(UrlRequest request, UrlResponseInfo info) throws Exception {
            this.mWrappedCallback.onResponseStarted(request, info);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onReadCompleted(UrlRequest request, UrlResponseInfo info, ByteBuffer byteBuffer) throws Exception {
            this.mWrappedCallback.onReadCompleted(request, info, byteBuffer);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onSucceeded(UrlRequest request, UrlResponseInfo info) {
            this.mWrappedCallback.onSucceeded(request, info);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onFailed(UrlRequest request, UrlResponseInfo info, CronetException error) {
            this.mWrappedCallback.onFailed(request, info, error);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onCanceled(UrlRequest request, UrlResponseInfo info) {
            this.mWrappedCallback.onCanceled(request, info);
        }
    }

    public static final class UrlRequestStatusListener extends UrlRequest.StatusListener {
        private final UrlRequest.StatusListener mWrappedListener;

        public UrlRequestStatusListener(UrlRequest.StatusListener listener) {
            this.mWrappedListener = listener;
        }

        @Override // org.chromium.net.UrlRequest.StatusListener
        public void onStatus(int status) {
            this.mWrappedListener.onStatus(status);
        }
    }

    public static final class BidirectionalStreamCallback extends BidirectionalStream.Callback {
        private final BidirectionalStream.Callback mWrappedCallback;

        public BidirectionalStreamCallback(BidirectionalStream.Callback callback) {
            this.mWrappedCallback = callback;
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public void onStreamReady(BidirectionalStream stream) {
            this.mWrappedCallback.onStreamReady(stream);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public void onResponseHeadersReceived(BidirectionalStream stream, UrlResponseInfo info) {
            this.mWrappedCallback.onResponseHeadersReceived(stream, info);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public void onReadCompleted(BidirectionalStream stream, UrlResponseInfo info, ByteBuffer buffer, boolean endOfStream) {
            this.mWrappedCallback.onReadCompleted(stream, info, buffer, endOfStream);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public void onWriteCompleted(BidirectionalStream stream, UrlResponseInfo info, ByteBuffer buffer, boolean endOfStream) {
            this.mWrappedCallback.onWriteCompleted(stream, info, buffer, endOfStream);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public void onResponseTrailersReceived(BidirectionalStream stream, UrlResponseInfo info, UrlResponseInfo.HeaderBlock trailers) {
            this.mWrappedCallback.onResponseTrailersReceived(stream, info, trailers);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public void onSucceeded(BidirectionalStream stream, UrlResponseInfo info) {
            this.mWrappedCallback.onSucceeded(stream, info);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public void onFailed(BidirectionalStream stream, UrlResponseInfo info, CronetException error) {
            this.mWrappedCallback.onFailed(stream, info, error);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public void onCanceled(BidirectionalStream stream, UrlResponseInfo info) {
            this.mWrappedCallback.onCanceled(stream, info);
        }
    }

    public static final class UploadDataProviderWrapper extends UploadDataProvider {
        private final UploadDataProvider mWrappedProvider;

        public UploadDataProviderWrapper(UploadDataProvider provider) {
            this.mWrappedProvider = provider;
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() throws IOException {
            return this.mWrappedProvider.getLength();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
            this.mWrappedProvider.read(uploadDataSink, byteBuffer);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) throws IOException {
            this.mWrappedProvider.rewind(uploadDataSink);
        }

        @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.mWrappedProvider.close();
        }
    }

    public static final class RequestFinishedInfoListener extends RequestFinishedInfo.Listener {
        private final RequestFinishedInfo.Listener mWrappedListener;

        public RequestFinishedInfoListener(RequestFinishedInfo.Listener listener) {
            super(listener.getExecutor());
            this.mWrappedListener = listener;
        }

        @Override // org.chromium.net.RequestFinishedInfo.Listener
        public void onRequestFinished(RequestFinishedInfo requestInfo) {
            this.mWrappedListener.onRequestFinished(requestInfo);
        }

        @Override // org.chromium.net.RequestFinishedInfo.Listener
        public Executor getExecutor() {
            return this.mWrappedListener.getExecutor();
        }
    }

    public static final class NetworkQualityRttListenerWrapper extends NetworkQualityRttListener {
        private final NetworkQualityRttListener mWrappedListener;

        public NetworkQualityRttListenerWrapper(NetworkQualityRttListener listener) {
            super(listener.getExecutor());
            this.mWrappedListener = listener;
        }

        @Override // org.chromium.net.NetworkQualityRttListener
        public void onRttObservation(int rttMs, long whenMs, int source) {
            this.mWrappedListener.onRttObservation(rttMs, whenMs, source);
        }

        @Override // org.chromium.net.NetworkQualityRttListener
        public Executor getExecutor() {
            return this.mWrappedListener.getExecutor();
        }

        public int hashCode() {
            return this.mWrappedListener.hashCode();
        }

        public boolean equals(Object o) {
            if (o == null || !(o instanceof NetworkQualityRttListenerWrapper)) {
                return false;
            }
            return this.mWrappedListener.equals(((NetworkQualityRttListenerWrapper) o).mWrappedListener);
        }
    }

    public static final class NetworkQualityThroughputListenerWrapper extends NetworkQualityThroughputListener {
        private final NetworkQualityThroughputListener mWrappedListener;

        public NetworkQualityThroughputListenerWrapper(NetworkQualityThroughputListener listener) {
            super(listener.getExecutor());
            this.mWrappedListener = listener;
        }

        @Override // org.chromium.net.NetworkQualityThroughputListener
        public void onThroughputObservation(int throughputKbps, long whenMs, int source) {
            this.mWrappedListener.onThroughputObservation(throughputKbps, whenMs, source);
        }

        @Override // org.chromium.net.NetworkQualityThroughputListener
        public Executor getExecutor() {
            return this.mWrappedListener.getExecutor();
        }

        public int hashCode() {
            return this.mWrappedListener.hashCode();
        }

        public boolean equals(Object o) {
            if (o == null || !(o instanceof NetworkQualityThroughputListenerWrapper)) {
                return false;
            }
            return this.mWrappedListener.equals(((NetworkQualityThroughputListenerWrapper) o).mWrappedListener);
        }
    }

    public static final class LibraryLoader extends CronetEngine.Builder.LibraryLoader {
        private final CronetEngine.Builder.LibraryLoader mWrappedLoader;

        public LibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
            this.mWrappedLoader = libraryLoader;
        }

        @Override // org.chromium.net.CronetEngine.Builder.LibraryLoader
        public void loadLibrary(String libName) {
            this.mWrappedLoader.loadLibrary(libName);
        }
    }

    public static final class ApiVersion {
        public static int getMaximumAvailableApiLevel() {
            if (Integer.parseInt(getCronetVersion().split("\\.")[0]) < 59) {
                return org.chromium.net.ApiVersion.getApiLevel();
            }
            return org.chromium.net.ApiVersion.getMaximumAvailableApiLevel();
        }

        public static String getCronetVersion() {
            return org.chromium.net.ApiVersion.getCronetVersion();
        }
    }
}
